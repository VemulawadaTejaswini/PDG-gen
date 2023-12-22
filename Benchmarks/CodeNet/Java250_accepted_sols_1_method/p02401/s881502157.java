import java.util.Scanner; 
 public class Main {
   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
       
            int a ;
            String op ;
            int b ;
       
            int sum=0;
       
            String tasu = "+" ;
            String hiku = "-" ;
            String kake = "*" ;
            String waru = "/" ;
            String end = "?" ;
       
       while(true){
           a = sc.nextInt();
           op = sc.next();
           b = sc.nextInt();
           if(op.equals(tasu)){
               sum=a+b;
               System.out.println(sum);
           }
           if(op.equals(hiku)){
               sum=a-b;
               System.out.println(sum);
           }
           if(op.equals(kake)){
               sum=a*b;
               System.out.println(sum);
           }
           if(op.equals(waru)){
               sum=a/b;
               System.out.println(sum);
           }
           if(op.equals(end)){
               break;
           }
       }
   }
 }
