import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int digitsum = 0;
   int tmp = N;
   for(int i = 0;i<10;i++)
   {
     digitsum += tmp%10;
     tmp -= tmp%10;
     tmp = tmp/10;
   }
   
   if(N%digitsum==0) System.out.println("Yes");
   else System.out.println("No");
 }
}