import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String S = sc.next();
   int N = S.length();

   int count =0;
   for(int i =0;i<N;i++)
   {
    if(S.charAt(i)=='0') count++;
   }
   if(N-2*count>0) System.out.println(2*count);
   else System.out.println(2*(N-count));
 }
}