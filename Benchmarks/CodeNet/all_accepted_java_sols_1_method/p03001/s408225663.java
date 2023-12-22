import java.util.*;

class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   double W = sc.nextInt();
   double H = sc.nextInt();
   double x = sc.nextInt();
   double y = sc.nextInt();
   
   
   System.out.print(W*H/2);
   if((W/2 == x)&&(H/2 == y)){
   System.out.println(" 1");
   }else{
    System.out.println(" 0"); 
   }
 }
}
