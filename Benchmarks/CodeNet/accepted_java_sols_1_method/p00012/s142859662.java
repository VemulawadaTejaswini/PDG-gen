import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String BLANK = " ";

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try {
            while ((input = in.readLine()) != null) {

                String[] dataArrray = input.split(BLANK);

                double xa = Double.valueOf(dataArrray[0]);
                double ya = Double.valueOf(dataArrray[1]);
                double xb = Double.valueOf(dataArrray[2]);
                double yb = Double.valueOf(dataArrray[3]);
                double xc = Double.valueOf(dataArrray[4]);
                double yc = Double.valueOf(dataArrray[5]);
                double xp = Double.valueOf(dataArrray[6]);
                double yp = Double.valueOf(dataArrray[7]);

                // a -> bとa -> pの外積
                double crossPrdct1 = (xb - xa) * (yp - ya) - (yb - ya)
                        * (xp - xa);

                // b -> cとb -> pの外積
                double crossPrdct2 = (xc - xb) * (yp - yb) - (yc - yb)
                        * (xp - xb);

                // c -> aとc -> pの外積
                double crossPrdct3 = (xa - xc) * (yp - yc) - (ya - yc)
                        * (xp - xc);

                // 全て同じ符号ならば三角形の内部
                if ((crossPrdct1 > 0.0 && crossPrdct2 > 0.0 && crossPrdct3 > 0.0)
                        || (crossPrdct1 < 0.0 && crossPrdct2 < 0.0 && crossPrdct3 < 0.0)) {

                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}