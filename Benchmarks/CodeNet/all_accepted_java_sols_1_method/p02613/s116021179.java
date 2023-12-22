import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n, index;
		String s;
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		Integer count;
		String[] verdict = {"AC", "WA", "TLE", "RE"}; 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		for(index = 1; index <= n; index++) {
			s = br.readLine();
			count = hashMap.getOrDefault(s, 0);
			hashMap.put(s, ++count);
		}
		s = verdict[0];
		count = hashMap.getOrDefault(s, 0);
		System.out.println(s+" x "+count);
		s = verdict[1];
		count = hashMap.getOrDefault(s, 0);
		System.out.println(s+" x "+count);
		s = verdict[2];
		count = hashMap.getOrDefault(s, 0);
		System.out.println(s+" x "+count);
		s = verdict[3];
		count = hashMap.getOrDefault(s, 0);
		System.out.println(s+" x "+count);
	}
}
