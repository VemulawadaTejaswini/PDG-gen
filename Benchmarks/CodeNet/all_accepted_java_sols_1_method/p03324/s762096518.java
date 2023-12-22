import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int D = sc.nextInt();
   int N = sc.nextInt();

   int a ;
   if(N == 100) a = 101; 
   else a = N;
   
   if(D==0) System.out.println(a);
   else if(D==1) System.out.println(a*100);
   else if(D==2) System.out.println(a*10000);
 }
}