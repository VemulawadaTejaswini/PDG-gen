import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();        
        String op =sc.nextLine();
        if(op.equals("+")){
            int aopb = a+b;
        }
        if(op.equals("-")){
            int aopb = a-b;
        }
        if(op.equals("*")){
            int aopb = a*b;
        }
        if(op.equals("/")){
            int aopb = a/b;
        }
        if(op.equals("?")){
            break;
        }
        System.out.println(aopb);
        }
    }
}
