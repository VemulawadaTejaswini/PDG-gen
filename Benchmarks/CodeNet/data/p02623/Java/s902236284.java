import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     long k = sc.nextLong();
     long[] a = new long[n+1];
     long[] b = new long[m+1];
     int i,j,ans=0;
     
     a[0] = 0;
     for(i=1;i<=n;i++){
       a[i] = a[i-1]+sc.nextLong();
     }
     
     b[0] = 0;
     for(i=1;i<=m;i++){
       b[i] = b[i-1]+sc.nextLong();
     }
     for(i=0;i<=n;i++){
       if(k<a[i]){
         break;
       }
       for(j=0;j<=m;j++){
         if(k>=a[i]+b[j]){
           ans = Math.max(ans,i+j);
         }else{
           break;
         }
       }
     }
     System.out.println(ans);

   }
}
