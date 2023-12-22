import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}

		// 計算
		String result = "NO";
		int[] b = Arrays.copyOf(a, n);
		Arrays.sort(b);
		//System.out.println(Arrays.toString(b));
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    if(a[i] != b[i]) cnt++;
		}
		if(cnt == 0 || cnt == 2) result = "YES";
		// 出力
		System.out.println(result);
	}
	
}
