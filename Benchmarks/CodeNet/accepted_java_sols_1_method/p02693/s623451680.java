import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int k = sc.nextInt();
		// スペース区切りの整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();

        boolean canSuccess = false;
        for (int i = a; i <= b; i++) {
            canSuccess = (i % k) == 0;
            if(canSuccess) {
                break;
            }
        }

		// 出力
		System.out.println(canSuccess ? "OK" : "NG");
	}
}