import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int cnt = 0;
		List<Integer> nList = new ArrayList<Integer>();
		List<Integer> resultList = new ArrayList<Integer>();

		while((str = br.readLine()) != null) {
			nList.add(Integer.parseInt(str));
		}

		for(int n : nList) {
			for(BigInteger i = new BigInteger("2"); i.intValue() <= n; i = i.nextProbablePrime()) {
				cnt++;
			}
			resultList.add(cnt);
			cnt = 0;
		}

		for(int result : resultList) {
			System.out.println(result);
		}
	}
}