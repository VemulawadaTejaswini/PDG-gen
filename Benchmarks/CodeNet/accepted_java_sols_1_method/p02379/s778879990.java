import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data[];
        double points[] = new double[4];

        try {
            data = br.readLine().split(" ");
            for (int i = 0; i < 4; i++)
                points[i] = Double.parseDouble(data[i]);
            double dis = Math.sqrt(Math.pow(points[3] - points[1], 2) + Math.pow(points[2] - points[0], 2));
            System.out.printf("%.4f", dis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
