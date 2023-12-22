import java.util.*;

class Main{
   public static void main(String args[]){
         Scanner str = new Scanner(System.in);
         int X = str.nextInt();
         int Y = str.nextInt();
         String r = String.valueOf(X*Y);
         String l = String.valueOf((X+Y)*2);
         System.out.println(r + " " +l);     
   }

}