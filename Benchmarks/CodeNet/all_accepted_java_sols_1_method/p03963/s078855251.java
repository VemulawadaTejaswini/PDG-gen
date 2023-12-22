
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N,K;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		sc.close();
		int pattern = K;
		for(int i=0;i<N-1;i++){
			pattern *= (K-1);
		}
		System.out.println(pattern);
	}

}
