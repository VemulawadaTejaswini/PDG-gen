import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        for(int i = 0; i <- 20000; i++){
            Scanner scan = new java.util.Scanner(System.in);
            int a = scan.nextInt();
            String op = scan.toString();
            int b = scan.nextInt();
            if(op == "+"){
               System.out.println(a + b);
            }else if(op == "-"){
               System.out.println(a - b);
            }else if(op == "*"){
               System.out.println(a * b);
            }else if(op == "/"){
               System.out.println(a / b);
            }else if(op == "?"){
                break;
            }
        }
    }
}