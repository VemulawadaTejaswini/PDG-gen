import java.util.Scanner;

public class Main {
    static int ans;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double EPS = 1e-10;
        while (true) {
            // 複数のデータセットの並びが入力として与えられます。入力の終わりはゼロひとつの行で示されます。 各データセットは以下のとおりです。
            //
            // 1行目 第1の多角形の頂点の数 m（整数）
            // 2行目 第1の多角形の頂点1の情報 v1（整数）
            // 3行目 第1の多角形の頂点2の情報 v2
            // ：
            // m行目 第1の多角形の頂点m-1の情報 vm-1
            // m+1行目 第2の多角形の頂点の数 n（整数）
            // m+2行目 第2の多角形の頂点1の情報 v1（整数）
            // m+3行目 第2の多角形の頂点2の情報 v2
            // ：
            // m+n行目 第2の多角形の頂点n-1の情報 vn-1
            int m = sc.nextInt();
            if (m == 0)
                break;
            int[] vs = new int[m - 1];
            for (int i = 0; i < m - 1; i++) {
                vs[i] = sc.nextInt();
            }
            int n = sc.nextInt();
            int[] us = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                us[i] = sc.nextInt();
            }
            double a1 = calcArea(vs);
            double a2 = calcArea(us);
            if (Math.abs(a1 - a2) < EPS)
                System.out.println(0);
            else if (a1 > a2)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }

    public static double calcArea(int vs[]) {
        double area = 0;
        int sum = 0;
        for (int i = 0; i < vs.length; i++) {
            area += Math.abs(Math.sin(Math.PI * vs[i] / 180)) / 2;
            sum += vs[i];
        }
        area += Math.abs(Math.sin(Math.PI * (360 - sum) / 180)) / 2;
        return area;
    }
}