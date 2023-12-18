import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		String[] Str = S.split("");
		String StrOut = Str[0];

		if(S.length() <= K) {
			System.out.println(S);
		}else {
		for(int i = 1;i<K;i++) {
			StrOut += Str[i];
		}

		StrOut += "...";
		System.out.println(StrOut);
		}
	}
}