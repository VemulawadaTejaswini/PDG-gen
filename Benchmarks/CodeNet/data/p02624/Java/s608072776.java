import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] div = new long[n];
      
      
      for(int i=1;i<n+1;i++){
        for(int j=1;j*i<n+1;j++){
          div[i-1] += i*j;
        }
      }
      
      long ans = 0;
      for(int i=1;i<n+1;i++){
        ans += div[i-1];
      }
      System.out.println(ans);
	}
}