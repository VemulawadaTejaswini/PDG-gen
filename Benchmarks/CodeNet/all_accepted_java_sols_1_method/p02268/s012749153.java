import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
		String[] strInputNums = br.readLine().split(" ");
		for (int i = 0; i < size; i++) {
			if (!set.contains(strInputNums[i])) {
				set.add(strInputNums[i]);
			}
		}
		size = Integer.parseInt(br.readLine());
		strInputNums = br.readLine().split(" ");
		int matchCnt = 0;
		for (int i = 0; i < size; i++) {
			if (set.contains(strInputNums[i])) {
				matchCnt++;
			}
		}
		System.out.println(matchCnt);
	}
}