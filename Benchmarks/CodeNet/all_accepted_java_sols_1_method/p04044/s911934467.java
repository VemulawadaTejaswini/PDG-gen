import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int L = scanner.nextInt();
		String[] S = new String[N];
		Map<String, String> map = new TreeMap<String,String>();
		for(int i=0;i<N;i++) {
			S[i] = scanner.next();
			if(map.get(S[i])==null) {
				map.put(S[i], S[i]);
			}
			else {
				map.put(S[i]+i, S[i]);
			}
		}
		L=L+1;
		for(String s:map.values()) {
			System.out.print(s);
		}
		System.out.println();
		scanner.close();
	}

}
