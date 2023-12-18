import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int n = 0;
      	for (int i=0; i<101; i++) {
          int x = 10^(100-i);
          n += a/x;
          a = a%x;
        }
		// 出力
      	if (n%9 == 0) {
			System.out.println("Yes");
		} else {
          	System.out.println("No");
        }
    }
}
