import java.util.*;
class Main{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   if(b>c && a<c)
   {
     System.out.println("Yes");
   }
   else if(a>c && b<c)
   {
     System.out.println("Yes");
   }
   else
     System.out.println("No");
 
 }
}