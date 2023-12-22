import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int L = scan.nextInt();
		String[] S = new String[N];
		String tmp = "";
		String blank = scan.nextLine();
		
		for(int i = 0; i < N; i++) {
			S[i] = scan.nextLine();
		}
		Arrays.sort(S);
		
		for(int i = 0; i < N; i++) {
			tmp += S[i];
		}
		
		System.out.print(tmp);
		
		scan.close();
	}

}
