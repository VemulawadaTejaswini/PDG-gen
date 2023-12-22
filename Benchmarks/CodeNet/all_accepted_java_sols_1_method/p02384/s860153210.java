import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] dice = br.readLine().split(" ");
		List<String> sf1 = Arrays.<String>asList(dice[1], dice[2], dice[4], dice[3], dice[1]);
		List<String> sf2 = Arrays.<String>asList(dice[5], dice[2], dice[0], dice[3], dice[5]);
		List<String> sf3 = Arrays.<String>asList(dice[1], dice[5], dice[4], dice[0], dice[1]);
		List<String> sf4 = Arrays.<String>asList(dice[1], dice[0], dice[4], dice[5], dice[1]);
		List<String> sf5 = Arrays.<String>asList(dice[0], dice[2], dice[5], dice[3], dice[0]);
		List<String> sf6 = Arrays.<String>asList(dice[4], dice[2], dice[1], dice[3], dice[4]);
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String[] input = br.readLine().split(" ");
			if (input[0].equals(dice[0])) System.out.println(sf1.get(sf1.indexOf(input[1]) + 1));
			else if (input[0].equals(dice[1])) System.out.println(sf2.get(sf2.indexOf(input[1]) + 1));
			else if (input[0].equals(dice[2])) System.out.println(sf3.get(sf3.indexOf(input[1]) + 1));
			else if (input[0].equals(dice[3])) System.out.println(sf4.get(sf4.indexOf(input[1]) + 1));
			else if (input[0].equals(dice[4])) System.out.println(sf5.get(sf5.indexOf(input[1]) + 1));
			else if (input[0].equals(dice[5])) System.out.println(sf6.get(sf6.indexOf(input[1]) + 1));
		}
	}
}