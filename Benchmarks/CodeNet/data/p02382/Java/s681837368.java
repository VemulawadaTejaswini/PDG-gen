import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        int[] x = new int[n];
        int[] y = new int[n];
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p_infi = 0;

        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(str1[i]);
            y[i] = Integer.parseInt(str2[i]);
        }

        for(int i = 0; i < n; i++){
            p1 += Math.abs(Math.pow(x[i] - y[i], 1));
            p2 += Math.abs(Math.pow(x[i] - y[i], 2));
            p3 += Math.abs(Math.pow(x[i] - y[i], 3));
            double tmp = Math.abs(x[i] - y[i]);
            if(tmp > p_infi){
                p_infi = tmp;
            }
        }
        p2 = Math.sqrt(p2);
        p3 = Math.cbrt(p3);

        System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p_infi);
    }
}