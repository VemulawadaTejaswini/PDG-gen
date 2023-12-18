
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        int dataSetCount = Integer.parseInt(inputReader.readLine());
        while (dataSetCount-- > 0) {
            System.out.println(check(inputReader.readLine()));
        }
    }

    private static String check(String data) {
        String[] temp = data.split(" ");
        double[] points = new double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            points[i] = Double.parseDouble(temp[i]);
        }
        double l1 = points[0] - points[2] / Math.abs(points[1] - points[3]);
        double l2 = points[4] - points[6] / Math.abs(points[5] - points[7]);
        return l1 != l2 ? "NO" : "YES";
    }
}