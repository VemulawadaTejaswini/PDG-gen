import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        double sum = 0;
        for(int i = 0 ; i < N ; i++) {
            String[] s = stdR.readLine().split(" ");
            double d = Double.parseDouble(s[0]);
            String cur = s[1];
            if(cur.equals("JPY")) {
                sum += d;
            }else {
                sum += d * 380000d;
            }
        }
        System.out.println(sum);
    }
}
