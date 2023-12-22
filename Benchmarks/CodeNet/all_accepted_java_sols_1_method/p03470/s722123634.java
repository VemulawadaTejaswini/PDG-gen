import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int S[] = new int[N+1];
		for(int i = 1;i < N+1;i++) {
			S[i] = sc.nextInt();
		}
		Arrays.sort(S);
		int count = 0;
		for(int i = 1;i < S.length;i++) {
			if(S[i] == S[i-1])continue;
			count++;
		}
		System.out.println(count);
	}
}
