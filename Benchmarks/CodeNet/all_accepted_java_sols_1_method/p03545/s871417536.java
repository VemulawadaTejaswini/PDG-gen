import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int d = n % 10;
        int c = n / 10 % 10;
        int b = n / 10 / 10 % 10;
        int a = n / 10 / 10 / 10 % 10;
        
        String op1 = "", op2 = "", op3 = "";
        if (a-b-c-d==7) {
            op1 = "-";
            op2 = "-";
            op3 = "-";
        }
        else if (a-b-c+d==7) {
            op1 = "-";
            op2 = "-";
            op3 = "+";
        }
        else if (a-b+c-d==7) {
            op1 = "-";
            op2 = "+";
            op3 = "-";
        }
        else if (a-b+c+d==7) {
            op1 = "-";
            op2 = "+";
            op3 = "+";
        }
        else if (a+b-c-d==7) {
            op1 = "+";
            op2 = "-";
            op3 = "-";
        }
        else if (a+b-c+d==7) {
            op1 = "+";
            op2 = "-";
            op3 = "+";
        }
        else if (a+b+c-d==7) {
            op1 = "+";
            op2 = "+";
            op3 = "-";
        }
        else if (a+b+c+d==7) {
            op1 = "+";
            op2 = "+";
            op3 = "+";
        }
        
        
        System.out.println(a + op1 + b + op2 + c + op3 + d + "=7");
    }
}
