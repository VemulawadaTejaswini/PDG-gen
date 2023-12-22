import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


import static java.lang.System.in;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] lo =reader.readLine().split(" ");
        int A = Integer.parseInt(lo[0]);
        int B = Integer.parseInt(lo[1]);
        int H = Integer.parseInt(lo[2]);
        int M = Integer.parseInt(lo[3]);
        double angle = Math.abs((H+M/(double)60)*(Math.PI/(double)6) - M*(Math.PI/(double)30));
        double res = Math.sqrt((double)(A*A)+(double)(B*B)-2*A*B*Math.cos(angle));
        DecimalFormat dec = new DecimalFormat("#0.000000000");
         System.out.println(dec.format(res));
    }
}
