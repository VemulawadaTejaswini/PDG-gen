import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a, b;
        String op;
        for(;;){
            Scanner scan = new java.util.Scanner(System.in);
            a = scan.nextInt();
            op = scan.next();
            b = scan.nextInt();
            if(op.equals("+")){
               System.out.println(a + b);
            }else if(op.equals("-")){
               System.out.println(a - b);
            }else if(op.equals("*")){
               System.out.println(a * b);
            }else if(op.equals("/")){
               System.out.println(a / b);
            }else if(op.equals("?")){
                break;
            }
        }
    }
}