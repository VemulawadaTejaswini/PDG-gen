import java.io.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        String op = "null";
        int S = 0;
        int i = 0;
        while(i == 0){
            a = scan.nextInt();
            op = scan.next();
            b = scan.nextInt();
            
            
            if(op.equals("+")){
                S = a + b;
                System.out.println(S);
            }else  if(op.equals("-")){
                S = a - b;
                System.out.println(S);
            }else  if(op.equals("*")){
                S = a * b;
                System.out.println(S);
            }else  if(op.equals("/")){
                S = a / b;
                System.out.println(S);
            }else if(op.equals("?")){
                i = 1;
            }
        }
     }
    
}

