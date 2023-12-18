import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		for(int i = 0; i < 3; i++)
			if(S[i] == T[i])
				ans++;
		System.out.println(ans);

	}

}