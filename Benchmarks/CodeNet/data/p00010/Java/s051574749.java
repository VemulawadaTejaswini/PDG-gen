import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    /** 計算精度（double と同程度にしておく） */
    private static final int SCALE = 16;

    /**
     * 空白区切りの6つの数字を受け取り、
     * その6つの数字を3点とする三角形の外心および外接円の半径を取得する。
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        // 入力値をリストで受け取る
        BigDecimal[][] triangleList = readTriangleList();

        for (BigDecimal[] trianglePoints : triangleList) {
            // 三角形クラスに値を設定する
            Triangle triangle = new Triangle(trianglePoints);

            // 外接円を求める
            CircumscribedCircle circumscribedCircle = triangle
                    .calculateCircumscribedCircle();

            // 外接円の中心座標と半径を出力する
            printCircumscribedCircle(circumscribedCircle);
        }

    }

    /**
     * 標準入力から空白区切りの数値を取得し、三角形を表す数値の2次元配列として返却する。
     *
     * @return 三角形を表す整数の2次元配列（6×データ数）
     */
    protected static BigDecimal[][] readTriangleList() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        // 最初にデータの個数を取得する
        int numberOfLine = Integer.parseInt(reader.readLine());

        // 1行につき、6データずつ取り込む
        final int NUMBER_OF_ELEMENT = 6;
        BigDecimal[][] triangleList = new BigDecimal[numberOfLine][NUMBER_OF_ELEMENT];
        for (int i = 0; i < triangleList.length; i++) {
            String[] lengthArray = reader.readLine().split(" ");
            for (int j = 0; j < lengthArray.length; j++) {
                triangleList[i][j] = new BigDecimal(lengthArray[j]);
            }
        }

        if (reader != null) {
            reader.close();
        }

        return triangleList;
    }

    /**
     * 外接円の中心座標と半径を表示する。
     *
     * @param circumscribedCircle
     *            外接円
     */
    protected static void printCircumscribedCircle(
            final CircumscribedCircle circumscribedCircle) {
        System.out.print(getScaledString(circumscribedCircle.getCenter().getX()));
        System.out.print(" ");
        System.out.print(getScaledString(circumscribedCircle.getCenter().getY()));
        System.out.print(" ");
        System.out.print(getScaledString(circumscribedCircle.getRadius()));
        System.out.println();
    }

    /**
     * 数値を表示用に丸めて文字列にして返す。
     *
     * @param value 数値
     * @return 小数点以下3桁で丸めた文字列
     */
    protected static String getScaledString(BigDecimal value) {
        return value.setScale(3, RoundingMode.HALF_UP).toPlainString();
    }

    /**
     * 外接円を表すクラス
     *
     */
    static class CircumscribedCircle {

        /** 外心 */
        private Point center;

        /** 半径 */
        private BigDecimal radius;

        /**
         * コンストラクタ
         *
         * @param center
         * @param radius
         */
        public CircumscribedCircle(final Point center, final BigDecimal radius) {
            this.center = center;
            this.radius = radius;
        }

        public Point getCenter() {
            return center;
        }

        public void setCenter(Point center) {
            this.center = center;
        }

        public BigDecimal getRadius() {
            return radius;
        }

        public void setRadius(BigDecimal radius) {
            this.radius = radius;
        }
    }

    /**
     * 三角形を表すクラス
     *
     */
    static class Triangle {

        /** 点A */
        private Point a;

        /** 点B */
        private Point b;

        /** 点C */
        private Point c;

        /**
         * コンストラクタ
         *
         * @param points
         *            座標を表す数値配列
         */
        public Triangle(final BigDecimal[] points) {
            a = new Point(points[0], points[1]);
            b = new Point(points[2], points[3]);
            c = new Point(points[4], points[5]);
        }

        /**
         * 外接円を求める。
         *
         * @return 外接円
         */
        public CircumscribedCircle calculateCircumscribedCircle() {

            // 外心を求める
            // 垂直二等分線を2つ求めて、連立方程式を解く
            final BigDecimal[][] simultaneousEquation = new BigDecimal[2][3];
            simultaneousEquation[0] = a.calculateMidperpendicular(b); // AB
            simultaneousEquation[1] = a.calculateMidperpendicular(c); // AC
            final BigDecimal[] answer = calculateSimultaneousEquation(simultaneousEquation);
            final Point center = new Point(answer[0], answer[1]);

            // 外接円の半径を求める
            final BigDecimal radius = center.calculateDistance(a);

            return new CircumscribedCircle(center, radius);
        }

        public Point getA() {
            return a;
        }

        public void setA(Point a) {
            this.a = a;
        }

        public Point getB() {
            return b;
        }

        public void setB(Point b) {
            this.b = b;
        }

        public Point getC() {
            return c;
        }

        public void setC(Point c) {
            this.c = c;
        }

    }

    /**
     * 平面座標を表すクラス
     *
     */
    static class Point {

        /** x座標 */
        private BigDecimal x;

        /** y座標 */
        private BigDecimal y;

        /**
         * コンストラクタ
         *
         * @param x
         *            x座標
         * @param y
         *            y座標
         */
        public Point(final BigDecimal x, final BigDecimal y) {
            this.x = x;
            this.y = y;
        }

        /**
         * 引数で渡された座標と自分を結ぶ直線の傾きを求める。
         *
         * @param opponent
         *            傾きを求める相手の座標
         * @return 傾き
         */
        public BigDecimal calculateTilt(final Point opponent) {
            final BigDecimal distanceX = x.subtract(opponent.getX());
            final BigDecimal distanceY = y.subtract(opponent.getY());

            // 傾きが無限大の場合は null を返す
            if (distanceX.compareTo(BigDecimal.ZERO) == 0) {
                return null;
            }
            return distanceY.divide(distanceX, SCALE, RoundingMode.HALF_UP);

        }

        /**
         * 引数で渡された座標と自分との距離を求める。
         *
         * @param opponent
         *            距離を求める相手の座標
         * @return 距離
         */
        public BigDecimal calculateDistance(final Point opponent) {
            final BigDecimal distanceX = x.subtract(opponent.getX());
            final BigDecimal distanceY = y.subtract(opponent.getY());
            return sqrt(distanceX.pow(2).add(distanceY.pow(2)));
        }

        /**
         * 引数で渡された座標と自分との垂直二等分線を求める。
         * 方程式を ax + by = c という形式にした際の、a, b, c のリストを返す。
         *
         * @param opponent
         *            垂直二等分線を求める相手の座標
         * @return 垂直二等分線を表す方程式の係数リスト
         */
        public BigDecimal[] calculateMidperpendicular(final Point opponent) {
            final BigDecimal tilt = calculateTilt(opponent);
            final Point middle = calculateMiddlePoint(opponent);

            final BigDecimal[] equation = new BigDecimal[3];
            if (tilt == null) {
                // 元の傾きが無限大の場合は、y = c の形で方程式を作る
                equation[0] = BigDecimal.ZERO;
                equation[1] = BigDecimal.ONE;
                equation[2] = middle.getY();

            } else if (tilt.compareTo(BigDecimal.ZERO) == 0) {
                // 元の傾きが0の場合は、x = c の形で方程式を作る
                equation[0] = BigDecimal.ONE;
                equation[1] = BigDecimal.ZERO;
                equation[2] = middle.getX();

            } else {
                // ax + y = c の形で方程式を作る
                equation[0] = BigDecimal.ONE.divide(tilt, SCALE, RoundingMode.HALF_UP);
                equation[1] = BigDecimal.ONE;
                equation[2] = equation[0].multiply(middle.getX()).add(middle.getY());
            }

            return equation;
        }

        /**
         * 引数で渡された座標と自分との中点を求める。
         *
         * @param opponent
         *            中点を求める相手の座標
         * @return 中点
         */
        public Point calculateMiddlePoint(final Point opponent) {
            final BigDecimal TWO = BigDecimal.valueOf(2);
            final BigDecimal middleX = x.add(opponent.getX()).divide(TWO, SCALE, RoundingMode.HALF_UP);
            final BigDecimal middleY = y.add(opponent.getY()).divide(TWO, SCALE, RoundingMode.HALF_UP);
            return new Point(middleX, middleY);
        }

        public BigDecimal getX() {
            return x;
        }

        public void setX(BigDecimal x) {
            this.x = x;
        }

        public BigDecimal getY() {
            return y;
        }

        public void setY(BigDecimal y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point [x=" + x + ", y=" + y + "]";
        }

    }

    /**
     * 指定された連立方程式の解を求める。 解が1意に定まる前提でロジックを構築している。
     *
     * ax + by = c
     * dx + ey = f
     *
     * @param target
     *            連立方程式を表す整数配列
     * @return 解となる x と y
     */
    protected static BigDecimal[] calculateSimultaneousEquation(
            final BigDecimal[][] target) {

        final BigDecimal a = target[0][0];
        final BigDecimal b = target[0][1];
        final BigDecimal c = target[0][2];
        final BigDecimal d = target[1][0];
        final BigDecimal e = target[1][1];
        final BigDecimal f = target[1][2];
        BigDecimal[] answers = new BigDecimal[2];

        // （a * e - b * d）
        BigDecimal divisor = a.multiply(e).subtract(b.multiply(d));

        // x = (c * e - f * b) / divisor
        answers[0] = c.multiply(e).subtract(f.multiply(b)).divide(divisor, SCALE, RoundingMode.HALF_UP);

        // y = (a * f - c * d) / divisor
        answers[1] = a.multiply(f).subtract(c.multiply(d)).divide(divisor, SCALE, RoundingMode.HALF_UP);

        return answers;
    }

    /**
     * 平方根を求める。（BigDecimal用）
     *
     * @param a
     *            入力値
     * @return 入力値の平方根
     */
    protected static BigDecimal sqrt(final BigDecimal a) {

        // 0 の場合は計算を行わない
        if (a.compareTo(BigDecimal.ZERO) == 0) {
            return a;
        }

        // 計算精度（double と同程度にしておく）
        final BigDecimal EPSILON = BigDecimal.valueOf(0.0000000000000001);
        final BigDecimal TWO = BigDecimal.valueOf(2);

        // ニュートン法を用いて算出する
        BigDecimal x0 = null;
        BigDecimal x1 = BigDecimal.ONE;
        do {
            x0 = x1;
            x1 = x0.subtract(x0
                    .multiply(x0)
                    .subtract(a)
                    .divide(x0.multiply(TWO), SCALE,
                            BigDecimal.ROUND_HALF_EVEN));
        } while(x1.subtract(x0).abs().compareTo(EPSILON) > 0);

        return x1;
    }

}