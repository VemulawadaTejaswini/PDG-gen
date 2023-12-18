import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            String buf = sc.next();
            char op = buf.charAt(0);
            int b = sc.nextInt();
            if(op == '+')System.out.println(a + b);
            else if(op == '-')System.out.println(a - b);
            else if(op == '*')System.out.println(a * b);
            else if(op == '/')System.out.println(a / b);
            else break;
        }

    }
  
}
