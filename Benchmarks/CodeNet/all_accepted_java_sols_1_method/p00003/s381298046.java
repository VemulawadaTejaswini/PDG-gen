import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br   = new BufferedReader(isr);
        PrintWriter out     = new PrintWriter(System.out);
        String line;
        String[] numList = new String[2];
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            line = br.readLine();
            numList = line.split(" ");
            double num0 = Math.pow(Double.parseDouble(numList[0]), 2);
            double num1 = Math.pow(Double.parseDouble(numList[1]), 2);
            double num2 = Math.pow(Double.parseDouble(numList[2]), 2);
            if ((num2 == num0 + num1) || (num0 == num1 + num2) || (num1 == num0 + num2)) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}