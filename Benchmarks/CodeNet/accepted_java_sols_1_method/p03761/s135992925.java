import java.util.Scanner;

/**
 * https://abc058.contest.atcoder.jp/tasks/arc071_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] s = new int[26][N];
		for(int i = 0; i<N; i++){
			for(char c: sc.next().toCharArray()){
				s[c-'a'][i]++;
			}
		}
		sc.close();
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<26; i++){
			char target = (char)('a'+i);
			int min = Integer.MAX_VALUE;
			for(int j=0; j<N; j++){
				min = Math.min(min, s[i][j]);
			}
			for(int j=0; j<min; j++){
				ans.append(target);
			}
		}
 
		System.out.println(ans.toString());
		
	}

}