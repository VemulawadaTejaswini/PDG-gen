import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int K = sc.nextInt();
     int[] p= new int[N];
     int i,ans=0,pans=0;
     double answer;
     for(i=0;i<N;i++){
       p[i] = sc.nextInt();
     }
     for(i=0;i<K;i++){
         ans+=p[i];
     }
     pans = ans;
     for(i=K;i<N;i++){
       pans = pans-p[i-K]+p[i];
       if(pans>ans){
         ans = pans;
       }
     }
     answer = (ans+K)/2.0;
     System.out.print(answer);
   }
}
