import java.util.*;

class main{
 public static void main(String[] args){
  Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int x = scn.nextInt();
   int t = scn.nextInt();
   
   while(x<t){
      x+=x;
      t+=t;
   }
   System.out.println(t);
 }
  
}