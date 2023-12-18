import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
  int x= scn.nextInt();
  int y= scn.nextInt();
   
   float t,c;

   if(x>y){
        System.out.print("No");
       return;
   }
   t=(y-2*x)/2;
   c=(4*x-y)/2;
   if(t==(int)t && c==(int)c && c>=0&&t>=0){
       System.out.print("Yes");
   }
   else{
        System.out.print("No");
   }
    return;
 }
}