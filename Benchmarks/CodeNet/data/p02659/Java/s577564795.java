
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        double a = Double.parseDouble(tokens[0]);
        double b = Double.parseDouble(tokens[1]);
        System.out.printf("%.0f\n",a*b);
    }


}