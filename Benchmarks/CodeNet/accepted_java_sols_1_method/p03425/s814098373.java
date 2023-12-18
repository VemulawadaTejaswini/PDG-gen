import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] counts = new long[5];
		for (int i = 0; i < n; i++) {
			switch (br.readLine().charAt(0)) {
				case 'M' :
				counts[0]++;
				break;
				case 'A' :
				counts[1]++;
				break;
				case 'R' :
				counts[2]++;
				break;
				case 'C' :
				counts[3]++;
				break;
				case 'H' :
				counts[4]++;
				break;
			}
		}
		long count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				for (int k = j + 1; k < 5; k++) {
					count += counts[i] * counts[j] * counts[k];
				}
			}
		}
		System.out.println(count);
	}
}
