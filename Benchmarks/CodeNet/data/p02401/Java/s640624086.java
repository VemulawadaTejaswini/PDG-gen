import java.util.Scanner;
class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int a;
       char op;
       int b;
       
       for(;;){  
         a = scan.nextInt();
         op = scan.next();
         b  = scan.nextInt();
         
         if(op == '+'){
              a += b;
         }else if(op == '-'){
              a -= b;
         }else if(op == '*'){
              a *= b;
         }else if(op == '/'){
              a /= b;
         }else if(op == '?'){
              break;
         }
         System.out.println(a);
       }
    }
}