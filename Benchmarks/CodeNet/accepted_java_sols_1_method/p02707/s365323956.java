import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] buka = new int[n];
		for(int i = 0; i < n-1; i++){
		    int boss = sc.nextInt()-1;
		    buka[boss]++;
		}
		
		// 計算
		//long result = -1;
		
		
		// 出力
		for(int i = 0; i < n; i++){
		    System.out.println(buka[i]);
		}
		//System.out.println(result);
	}
}

