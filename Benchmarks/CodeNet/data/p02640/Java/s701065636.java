import java.util.*;
class Main{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   int r=y%2;
   int c=y/2;
   if(r==0)
   {
     System.out.println("Yes");
   }
   else
   {
     System.out.println("No");
   }
 }
}
