import java.util.Scanner;
public class Main {
  public static void main(final String [] args){
       try(Scanner sc = new Scanner(System.in)){
         while (true){
         int a = sc.nextInt();
         String op = sc.next();
         int b = sc.nextInt();
         int c;
           if (op.equals("+")){
             c = a + b;
         } else if(op.equals("-")){
            c = a - b;
         } else if (op.equals("*")){
            c = a * b;
         } else if(op.equals("/")){
            c = a / b;
         } else{
           return;
         }
         System.out.println(c);
        
        }
        
    }
  }
}


