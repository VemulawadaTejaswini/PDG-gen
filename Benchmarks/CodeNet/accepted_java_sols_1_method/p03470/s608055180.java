import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[] list = new int[n];
        
        for(int i = 0; i < n; i++) {
          list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int ans = 1;
        for(int i = 1; i < list.length; i++) {
          if (list[i - 1] < list[i]) {
            ans++;
          }
        }
    
		// 出力
		System.out.println(ans);
	}
}