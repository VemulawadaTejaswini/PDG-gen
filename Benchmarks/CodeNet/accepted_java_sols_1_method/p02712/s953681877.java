import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long count = 0;

//	3でも5でも割り切れないときに、countにその数を足す
		for(int i=1 ; i<=n ; i++) {
			if(i%3==0 || i%5==0) {
				continue;
			}
			else {
				count += i;
			}
		}
		System.out.println(count);
	}
}
