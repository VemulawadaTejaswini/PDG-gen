import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();

		int[] num = Arrays.stream(str.split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();
		Arrays.sort(num);

		str = Arrays.stream(num).mapToObj(String::valueOf).collect(Collectors.joining(" "));
		System.out.println(str);
	}
}

