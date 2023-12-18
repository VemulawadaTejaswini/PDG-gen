import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n, sum, power, i;
        double m;
        while(true){
            n = Integer.parseInt(in.readLine());
            if(n == 0) break;

            String[] point = in.readLine().split(" ");
            sum = 0;
            power = 0;
            for(String str: point){
                i = Integer.parseInt(str);
                sum += i;
                power += Math.pow(i, 2);
            }
            m = (double)sum / n;
            double a = Math.sqrt(((double)power - 2 * m * sum + Math.pow(m, 2) * n) / n);
            sb.append(a + "\n");
        }

        System.out.print(sb);
        in.close();
    }
}