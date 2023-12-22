/**
 * Created by Koutaro on 2017/04/10.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a,b;
        String op;
        for(;;){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            switch(op){
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
                default:
                    break;
            }
            if (op.equals("?")) {
                break;
            }
        }
    }
}