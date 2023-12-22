import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, count[][];
		String s[];
		StringBuilder ans = new StringBuilder();
		
		n = sc.nextInt();
		
		s = new String[n];
		count = new int[n][26];
		
		for(int i = 0; i < n; ++i)s[i] = sc.next();
		sc.close();
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < s[i].length(); ++j) {
				char tmp = s[i].charAt(j);
				int tmp2 = tmp - 'a';
				++count[i][tmp2];
			}
		}
		
		for(int i = 0; i < 26; ++i) {
			int min = 51;
			char tmp = '\0';
			for(int j = 0; j < n; ++j)
				min = Math.min(min,  count[j][i]);
			tmp = (char)(i + 'a');
			for(int j = 0; j < min; ++j)
			ans.append(tmp);
		}
		
		System.out.println(ans);
	}

}
