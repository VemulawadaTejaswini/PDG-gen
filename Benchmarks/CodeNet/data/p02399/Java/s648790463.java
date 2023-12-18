import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        
        String[] ary = new String[2];
        
        ary = br.readLine().split(" ");
        int a = Integer.parseInt(ary[0]);
        int b = Integer.parseInt(ary[1]);
        
        int num1 = a / b;
        int num2 = a % b;
        double num3 = a / b;
        
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}