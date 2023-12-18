import java.util.Scanner;

public class Main{
    public static void main(String[]agrs){
        int a,b;
        String op;
        char op2;

        Scanner sc = new Scanner(System.in);

        while(true){
            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();
            op2 = op.charAt(0);
            if(op2 == '?') break;
        
            if(op2 == '+'){
                System.out.println(a+b);
            }else if(op2 == '-'){
                System.out.println(a-b);
            }else if(op2 == '*'){
                System.out.println(a*b);
            }else if(op2 == '/'){
                System.out.println(a/b);
            }
        }
    }    
}
