
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		List<Integer> list = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			list.add(Integer.parseInt(tokens[i]));
		}
		Collections.sort(list);
		long count = 0L;
		for (int i = N - 1; i >= 0; --i) {
			int longEdge = list.get(i);
			for (int j = i - 1; j >= 0; --j) {
				int middleEdge = list.get(j);
				if (longEdge / 2 >= middleEdge) {
					break;
				}
				for (int k = j - 1; k >= 0; --k) {
					if(list.get(k) + middleEdge > longEdge) {
						++count;
					}else {
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}