import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      long[] H = new long[n];
      for(int i=0;i<n;i++){   
         H[i]=sc.nextInt();
      }
      Arrays.sort(H); 
      long ans = 0;
      for(int i=0;i<n-k;i++){  
        ans+=H[i];
      }
      System.out.println(ans);
    }
}