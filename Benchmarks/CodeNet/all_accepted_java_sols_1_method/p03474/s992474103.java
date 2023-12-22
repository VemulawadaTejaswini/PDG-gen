import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int A = sc.nextInt();
   int B = sc.nextInt();
   char[] c = sc.next().toCharArray();
   boolean flg = true;
   
   for(int i=0;i<A;i++)
   {
     if(c[i]=='-') flg = false; 
   }
   if(c[A]!='-') flg = false;
   for(int i=A+1;i<A+B+1;i++)
   {
     if(c[i]=='-') flg = false; 
   }
 
   if(flg) System.out.println("Yes");
   else System.out.println("No");
 }
}