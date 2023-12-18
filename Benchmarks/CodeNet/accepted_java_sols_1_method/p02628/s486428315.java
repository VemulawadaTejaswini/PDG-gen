import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  n = sc.nextInt();
     int k = sc.nextInt();
     int[] alpha = new int[n];
     int i,j;
     for(i=0;i<n;i++){
       alpha[i]= sc.nextInt();
     }
     int flag;
     for (j = 1; j < alpha.length; j++) {
            int key = alpha[j];
            i = j - 1;
            while (i >= 0 && alpha[i] > key) {
                alpha[i + 1] = alpha[i];
                i--;
            }
            alpha[i + 1] = key;
        }
      int ans=0;
      for(j = 0;j<k;j++){
       ans += alpha[j];
      }
     System.out.println(ans);
 
   }
   
}