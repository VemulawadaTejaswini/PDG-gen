import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      int[] b = new int[a];
      int c = sc.nextInt();
      int d = 0;
      for(int i = 0; i < a; i++){
      	b[i] = sc.nextInt();
      }
        for (int i = 0; i < a- 1; i++) {
            for (int j = a - 1; j > i; j--) {
                if (b[j - 1] > b[j]) {
                    // 入れ替え
                    int tmp = b[j - 1];
                    b[j - 1] = b[j];
                    b[j] = tmp;
                }
             }
        }
      for(int i = 0; i < c; i++){
      	d += b[i];
      }
  
      System.out.println(d);
	}
}