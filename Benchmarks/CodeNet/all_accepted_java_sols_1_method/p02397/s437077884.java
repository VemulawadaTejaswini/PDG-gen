import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] strArr = br.readLine().split(" ");
			long[] arr = new long[2];
			arr[0] = Long.parseLong(strArr[0]);
			arr[1] = Long.parseLong(strArr[1]);
			if(arr[0] == 0 && arr[1] == 0)break;
			Arrays.sort(arr);
			System.out.printf("%d %d%n", arr[0], arr[1]);
		}
	}
}