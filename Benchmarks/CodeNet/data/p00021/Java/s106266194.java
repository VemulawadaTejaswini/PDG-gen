import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;

        try {
            cnt = Integer.valueOf(in.readLine());

            for (int i = 0; i < cnt; i++) {
                if (isParallel(in.readLine().split(" "))) {
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

    private static boolean isParallel(String[] split) {

        double x1 = Double.valueOf(split[0]);
        double y1 = Double.valueOf(split[1]);
        double x2 = Double.valueOf(split[2]);
        double y2 = Double.valueOf(split[3]);
        double x3 = Double.valueOf(split[4]);
        double y3 = Double.valueOf(split[5]);
        double x4 = Double.valueOf(split[6]);
        double y4 = Double.valueOf(split[7]);

        boolean result = false;

        if (y2 - y1 == 0.0) {
            result = y4 - y3 == 0.0;
        } else {
            result = (x2 - x1) / (y2 - y1) == (x4 - x3) / (y4 - y3);
        }

        return result;
    }
}