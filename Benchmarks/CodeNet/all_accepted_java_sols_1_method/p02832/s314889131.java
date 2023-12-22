import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  N = sc.nextInt();
     int[] a;
     a = new int[N];
     for(int i=0;i<N;i++){
       a[i]=sc.nextInt();
     }
     int j = 1;
     int ans = N;
     boolean flag=false;
     for(int i=0;i<N;i++){
       if(j==a[i]){
         j++;
         ans--;
         flag=true;
       }
     }
     if(!flag){
       ans = -1;
     }
     System.out.println(ans);
   }
}
