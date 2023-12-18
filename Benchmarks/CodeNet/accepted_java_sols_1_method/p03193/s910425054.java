import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NHW = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		List<long[]> list = new ArrayList<>(NHW[0]);
		br.lines().forEach(s -> {
			long[] ab = Arrays.stream(s.split(" ")).mapToLong(Long::parseLong).toArray();
			list.add(ab);
		});
		br.close();
		System.out.println(list.stream().filter(n -> n[0] >= NHW[1] && n[1] >= NHW[2]).count());
	}

}
