import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		int[] d = new int[N];
        int min = 0;
        boolean first = true;
        boolean plus = true;
		for (int i = 1; i <= N; i++) {
			d[i-1] = L+i-1;
            int num = 0;
            boolean plus2 = true;
            if(d[i-1] < 0){
             num = 0 - d[i-1];
             plus2 = false;
            } else {
             num = d[i-1] - 0;
            }
          
            if(min > num || first){
              min = num;
              plus = plus2;
            }
            if(first){
              first = false;
            }
		}
        int ans = 0;
  		for (int i = 0; i < N; i++) {
           ans += d[i];
        }
        ans = plus ? ans - min : ans + min;
		System.out.println(ans);
	}		
}
