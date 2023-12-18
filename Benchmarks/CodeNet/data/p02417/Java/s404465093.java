import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		char[] line = br.readLine().toCharArray();
		int[] num = new int[26];
		char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
						'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
							'v', 'w', 'x', 'y', 'z'};

		for(int i = 0; i < line.length; i++) {
			for(int j = 0; j < num.length; j++) {
				if (Character.toLowerCase(line[i]) == alp[j]) {
					num[j] = num[j] + 1;
				}
			}
		}

		for(int i = 0; i < alp.length; i++) {
			sb.append(alp[i]).append(" ").append(":").append(" ").append(num[i]).append("\n");
		}
		System.out.print(sb);
	}
}