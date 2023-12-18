import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		String S = sc.next();
		int len = S.length();
		
		if(len <= K){
			System.out.println(S);
			return;
		}

		String ans = "";
		for(int i = 0; i < K; i++){
			ans += S.charAt(i);
		}
		ans += "...";
		
		System.out.println(ans);
		return;

	}
}