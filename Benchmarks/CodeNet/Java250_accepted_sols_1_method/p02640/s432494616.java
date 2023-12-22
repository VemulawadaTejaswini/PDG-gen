import java.util.*;
class Main{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   String ans="No";
   for(int i=0;i<=x;i++)
   {
     int c=x-i;
	if(2*i+4*c==y)
   {
     ans="Yes";
      break;
   }
   }
   System.out.println(ans);
 }
}
