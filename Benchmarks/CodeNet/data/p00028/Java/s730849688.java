import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] times = new int[100];
		int max = 0;
		for (int i = 0; i < 100; i++) {
			times[i] = 0;
		}
		while (str!=null) {
			int num = Integer.parseInt(str);
			times[num - 1]++;
			if (times[num - 1] > max)
				max = times[num - 1];
			str = br.readLine();
		}
		for (int i = 0; i < 100; i++)
			if (times[i] == max)
				System.out.println(i);
	}
}