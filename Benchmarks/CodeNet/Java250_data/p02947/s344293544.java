import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		LinkedHashMap<String, Long> map = new LinkedHashMap<String, Long>();
		for (int i=0;i<N;i++) {
			String S = sort(sc.next());
		    if (map.containsKey(S)) {
		        map.put(S, map.get(S) + 1);
		    } else {
		        map.put(S, (long) 1);
		    }
		}
		long ans = 0;
		for(Long i : map.values()) {
			ans += i*(i-1)/2;
		}
		System.out.println(ans);

	}
	public static String sort(String S) {
		char[] C = S.toCharArray();
		Arrays.sort(C);
		S = new String(C);

		return S;

	}
}