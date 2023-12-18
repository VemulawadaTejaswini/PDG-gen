import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
 
   int sum = 0 ;
   int l=0;
   int r=0;
   for(int i=0;i<N;i++)
   {
	 l=sc.nextInt();
     r=sc.nextInt();
     sum += r-l+1;
   }
   System.out.println(sum);
 }
}