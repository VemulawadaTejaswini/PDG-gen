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
        int i = 0;
        int count = 0;
        boolean[] passed = new boolean[n];
        while(true) {
          if (i == 1) {
            break;
          }
          if (!passed[i]) {
             passed[i] = true;
             i = list[i] - 1;
             count++;
          } else {
            count = -1;
            break;
          }
        }
    
		// 出力
		System.out.println(count);
	}
}