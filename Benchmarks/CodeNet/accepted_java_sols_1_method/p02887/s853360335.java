import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		int len = S.length();
		int cnt = 0;
		for(int i = 1;i < N;i++){
			if(S.charAt(i-1)==S.charAt(i)){
				cnt++;
			}
		}
		System.out.println(len-cnt);
	}
}