import java.util.*;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int []a = new int [n];
      int sum =0;
      long []count = new long [100001];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        count[a[i]]++;
        sum += a[i];
      }
      
      int q = sc.nextInt();
      int []ans = new int[q];
  
      for(int i=0;i<q;i++){
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sum -= count[b]*b;
        sum += count[c]*c;
        ans[i] = sum;
        count[c] += count[b];
        count[b] =0;
      }
      for(int i=0;i<q;i++){
        System.out.println(ans[i]);
      }



     

      
    }
}