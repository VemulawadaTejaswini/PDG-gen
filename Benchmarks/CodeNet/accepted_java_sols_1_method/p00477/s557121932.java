import java.util.*;

class Main{
    
   public static void main(String a[]) throws java.io.IOException{
       Scanner scan =new Scanner (System.in);
       int total=0;
       for(int i=0;i<4;i++){
           total+=scan.nextInt();
       }
       System.out.println(total/60);
       System.out.println(total%60);
   }
}