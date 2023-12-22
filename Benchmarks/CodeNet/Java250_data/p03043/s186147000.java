import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int K = sc.nextInt();
   double ans =0.0;
     for(int i =1;i<=N;i++){
       if(i>=K){
         ans +=  1/(double)N;
       }
       if(i<K){
         double j=1.0;
         int num = i;
         while(num<K){
           j /=2;
           num = 2*num;
         }
   	  ans += (1/(double)N)*j;
       }
     }
     System.out.println(ans);
 }
}