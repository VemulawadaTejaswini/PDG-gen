import java.util.*;
 
public class Main {
 
	static Main instance = new Main();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a = new int[n];
        long[] count = new long[n];
      
        for(int i = 0; i < n ; i++){
          a[i] = sc.nextInt()-1;
          count[a[i]]++;
        }
        
        long ans = 0;
        for(int i = 0 ; i < n ; i++){
          ans += (count[i]*(count[i]-1))/2;
        }
        
        for(int k = 0; k < n ; k++){
          int K = a[k];
          ans -= (count[K]-1);
          System.out.println(ans);
          ans += (count[K]-1);
        }
      
	}
}