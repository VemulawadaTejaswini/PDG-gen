import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	public static int N
;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = parseInt(st.nextToken());
		List<Integer> prices = new ArrayList<>();
		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine());
			prices.add(parseInt(st.nextToken()));
		}

		List<Integer> newP = prices.stream()
			.sorted((a, b) -> {
				return b-a;
			})
			.collect(Collectors.toList());

		int sum = newP.get(0) /2;

		for(int i=1;i<newP.size();i++) {
			sum += newP.get(i);

		}

		System.out.println(sum);

	}

}