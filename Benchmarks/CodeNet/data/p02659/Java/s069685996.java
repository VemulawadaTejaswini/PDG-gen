
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        long a = Long.parseLong(tokens[0]);
        double b = Double.parseDouble(tokens[1]);
        long whole = a*((long)b);
        double frac = a*(b-(long)b);
        double ans = whole+frac;
        System.out.println((long)ans);
    }


}