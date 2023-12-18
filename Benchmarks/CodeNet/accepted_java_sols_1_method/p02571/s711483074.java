import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		int c, max= 0;
		for(int i = 0; i < S.length - T.length + 1; i++) {
			c = 0;
			for(int j = 0; j < T.length; j++)
				if(S[i+j] == T[j])
					c++;
			max = Math.max(max, c);
		}
		System.out.println(T.length - max);
	}

}
