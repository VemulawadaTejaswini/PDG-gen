import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   
   int sum = 0 ;
   int tmp = N ;
   for(int i=0;i<10;i++)
   {
     sum+=tmp%10;
     tmp/=10;
	 if(tmp==0) break;
   }
   if(N%sum==0)System.out.println("Yes");
   else System.out.println("No");
 }
}