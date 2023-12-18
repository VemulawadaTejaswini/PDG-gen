import java.io.*;

class Main {

    public static void main(String[] args) {
        try {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            String str = sc.readLine();
            int n = Integer.valueOf(str);
            for (int i = 0; i < n; i++) {
                String[] str_array = sc.readLine().split(" ");
                double[] data = new double[8];
                for (int j = 0; j < 8; j++) {
                    data[j] = Double.valueOf(str_array[j]);
                }
                double x1 = data[2] - data[0];
                double y1 = data[3] - data[1];
                double x2 = data[6] - data[4];
                double y2 = data[7] - data[5];
                double sum1 = y1 / x1;
                double sum2 = y2 / x2;
                System.out.println((sum1 == sum2) ? "YES" : "NO");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}