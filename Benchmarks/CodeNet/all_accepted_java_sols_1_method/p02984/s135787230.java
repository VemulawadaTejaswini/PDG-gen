import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		int N = Integer.parseInt(line);
		line = reader.readLine();
		String[] str = line.split(" ");
		int[] dam = new int[N];
		long[] yama = new long[N];
		for (int i = 0; i < N / 2; i++) {
			dam[2*i] = Integer.parseInt(str[2*i]);
			dam[2*i+1] = Integer.parseInt(str[2*i+1]);
			yama[0] += dam[2*i];
			yama[0] -= dam[2*i+1];
		}
		dam[N-1] = Integer.parseInt(str[N-1]);
		yama[0] += dam[N-1];
		System.out.print(yama[0] + " ");
		
		//yama[4] = 2*dam[3] - yama[3];
		for (int i = 0; i < N / 2; i++) {
			yama[2*i+1] = 2*dam[2*i] - yama[2*i];
			System.out.print(yama[2*i+1] + " ");
			yama[2*i+2] = 2*dam[2*i+1] - yama[2*i+1];
			System.out.print(yama[2*i+2] + " ");
		}
	}
}
