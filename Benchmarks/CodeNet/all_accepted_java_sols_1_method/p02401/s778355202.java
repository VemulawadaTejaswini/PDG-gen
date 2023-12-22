import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
             int x = sc.nextInt();
             String op = sc.next();
             int y = sc.nextInt();
            if(op.equals("+")){
                a = x+y;
            }
            if(op.equals("-")){
                a = x-y;       
            }
            if(op.equals("*")){
                a = x*y;
            }
            if(op.equals("/")){
                a = x/y;
            }
            if(op.equals("?")){
                sc.close();
                break;      
            }
            System.out.println(a);
        }
    }
}
