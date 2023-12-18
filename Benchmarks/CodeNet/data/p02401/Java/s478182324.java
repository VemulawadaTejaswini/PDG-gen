import java.util.*;
class Main{
   public static void main(System args[]){
      Scanner stdIn = new Scanner(System.in);
      int i = 0;
      int[] a,b;
      String[] op;
      while(i == 0){
         a[i] = stdIn.nextInt();
         op[i] = stdIn.next();
         b[i] = stdIn.nextInt();

         if(op[i] == "?") break;

         i++;
      }
      
      for(int j = 0; j<i; j++){
         if(op[j] == "+")
            System.out.println(a[j]+b[j]);
       
         else if(op[j] == "-")
            System.out.println(a[j]-b[j]);

         else if(op[j] == "*")
            System.out.println(a[j]*b[j]);

         else if(op[j] == "/")
            System.out.println(a[j]/b[j]);
      }
   }
}