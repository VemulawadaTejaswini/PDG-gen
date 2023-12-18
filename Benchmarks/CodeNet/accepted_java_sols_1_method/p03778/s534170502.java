import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int w = sc.nextInt();
   int a = sc.nextInt();
   int b = sc.nextInt();
   
   int ans ;
   if(a<b)
   {
     if(a+w<b) ans = b-a-w; 
     else ans =0;
   }
   else
   {
     if(b+w<a) ans = a-b-w;
     else ans =0;
   }
   System.out.println(ans);
 }
}