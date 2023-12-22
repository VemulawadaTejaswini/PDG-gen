import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            if(op.equals("?")){
                break;
            }else if (op.equals("+")){
                System.out.println(a + b);
            }else if (op.equals("-")){
                System.out.println(a - b);
            }else if (op.equals("*")) {
                System.out.println(a * b);
            }else if(op.equals("/")) {
                    System.out.println(a / b);
            }
        }
        sc.close();
    }
}