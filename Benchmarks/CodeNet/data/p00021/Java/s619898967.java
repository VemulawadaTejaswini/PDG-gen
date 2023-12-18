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
            double x1 = data[2] - data[0];
            double y1 = data[3] - data[1];
            double x2 = data[6] - data[4];
            double y2 = data[7] - data[5];
            if(x1==0||x2==0){
                if(x1==0&&x2==0){
                    System.out.println("YES");
                }else System.out.println("NO");
            }else{
                if(Math.abs((y1/x1)-(y2/x2))<=0.001){
                    System.out.println("YES");
                }else System.out.println("NO");
            }
        }
    }
}