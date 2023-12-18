import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int ii = 0; ii < n; ii++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double[] data = new double[8];
            for (int i = 0; i < 8; i++) {
                data[i] = Double.parseDouble(st.nextToken());
            }
            if (((data[3] - data[1])/( data[2] - data[0])) == ((data[7] - data[5]) / (data[6] - data[4]))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}