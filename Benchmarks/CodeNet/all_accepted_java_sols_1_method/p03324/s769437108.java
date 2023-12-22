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
 		String[] tmp = br.readLine().split(" ");
		int D = Integer.parseInt(tmp[0]);
		int N = Integer.parseInt(tmp[1]);
		int k;
		switch(D){
		case 0:
			k = 1;
			break;
		case 1:
			k = 100;
			break;
		case 2:
			k = 10000;
			break;
		default:
			k = 1;
		}
		if(N == 100){
			System.out.println((k*N) + k);
		}else{
			System.out.println(k * N);
		}
	}

}
