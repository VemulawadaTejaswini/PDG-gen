import java.util.*;
class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   long ans = 0;
   for(int i=1; i<=N; i++){
     if(i%3==0 || i%5==0){
       continue;
     }
     ans += i;
   }
   System.out.print(ans);
 }
}
