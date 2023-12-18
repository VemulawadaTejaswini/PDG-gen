import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		while(true){
			// キーボード入力
			Scanner stdIn = new Scanner(System.in);
			int n = stdIn.nextInt();
			int count = 0;

			// n が偶数なら素数ではない
			// n が奇数かつ1以外であれば、n 以下の奇数で割り切れるか調べ、割り切れれば素数ではない
			// n が0ならば素数ではない
			do{
				if(n == 0 || n == 1){
					continue;
				}
				if(n % 2 == 0){
					continue;
				}
				for(int i = 3;i < n;i += 2){
					if(n % i == 0){
						continue;
					}
				}
				count++;
			}while(--n > 1);
			System.out.println(count);
		}
	}
}