import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int count = 0;
        int maxCount = 0;
        int start = sc.nextInt();
        for(int i = 0; i < n - 1; i++) {
          int value = sc.nextInt();
          if (start >= value) {
            count++;
          } else {
            if (count > maxCount) {
              maxCount = count;
            }
            count = 0;
          }
          start = value;
        }
        if (count > maxCount) {
              maxCount = count;
        }
    
		// 出力
		System.out.println(maxCount);
	}
}