import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   long N = sc.nextLong();
   long M = sc.nextLong();
   long ans=0;
   
   if(2*N>=M) ans= M/2;
   else ans= N+(M-2*N)/4;
   System.out.println(ans);
 }
}