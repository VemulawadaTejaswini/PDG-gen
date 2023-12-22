import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Atcoder用
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		int c = Integer.parseInt(tmp[2]);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String get = br.readLine();
		char[] s = get.toCharArray();
		for(char c:s)System.out.println(c);

		List<Integer> ls = new ArrayList<Integer>();
		String[] tmp = br.readLine().split(" ");
		for (int n = 0; n < N; n++) {
			ls.add(Integer.parseInt(tmp[n]));
		}
 */

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();

		char[] S = s.toCharArray();
		char[] T = t.toCharArray();

		boolean isEqual = false;

		//O(S.len^2)
		for(int i = 0;i<S.length;i++){
			for(int j=0;j<S.length;j++){
				isEqual = true;
				if(S[(j+i)%S.length] != T[j]){
					isEqual = false;
					break;
				}

			}
			if(isEqual)break;
		}

		if(isEqual)System.out.println("Yes");
		else System.out.println("No");


	}
}