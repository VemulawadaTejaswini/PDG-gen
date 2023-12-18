import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int res = 0;

        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

            if (op.equals("?")) break;

            switch(op){
                case "+":
                    res = a + b;
                    break;
                case "-":
                    res = a - b;
                    break;
                case "*":
                    res = a * b;
                    break;
                case "/":
                    res = a / b;
                    break;
                default:
                    break;
            }
            System.out.println(res);
        }
    }
}

