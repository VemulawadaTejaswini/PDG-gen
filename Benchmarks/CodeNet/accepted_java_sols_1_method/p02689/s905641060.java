import java.util.*;
import static java.lang.Math.*;

public class Main {
    
    static int[] a;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++){
		    h[i] = sc.nextInt();
		}
		boolean[] bool = new boolean[n];
		for(int i = 0; i < m; i++){
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    if(h[a] >= h[b]) bool[b] = true;
		    if(h[b] >= h[a]) bool[a] = true;
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    if(!bool[i]) result++;
		}
		
		
		// 出力
		System.out.println(result);
	}
}
