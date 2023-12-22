
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

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
		String num = br.readLine();
 		String[] tmp = num.split("");

 		int N = Integer.parseInt(num);
		ArrayList<String> nls = new ArrayList<String>(Arrays.asList(tmp));

		int sum = 0;
		for(int i = 0;i<nls.size();i++){
			sum += Integer.parseInt(nls.get(i));
		}

		if(N%sum == 0)System.out.println("Yes");
		else System.out.println("No");

	}

}
