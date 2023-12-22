import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();

		String line = br.readLine();

		List<Integer> ary =  Arrays.asList(line.split(" ")).stream().map(Integer::valueOf).sorted().collect(Collectors.toList());

		int nagaiHen = ary.get(ary.size() - 1);
		ary.remove(ary.size() - 1);

		int hokanoHen = 0;

		for(int i : ary){
			hokanoHen += i;
		}

		System.out.println(nagaiHen < hokanoHen ? "Yes" : "No");

	}
}
