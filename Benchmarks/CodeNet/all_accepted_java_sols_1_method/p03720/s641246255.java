import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < m; i++) {
          list[sc.nextInt() - 1]++;
          list[sc.nextInt() - 1]++;
        }
    
		for(int i = 0; i < n; i++) {
          // 出力
		  System.out.println(list[i]);
        }
	}
}