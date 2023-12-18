import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int taro = 0;
		int hanako = 0;
		for(int i = 0; i < N; i++) {
			String[] set = br.readLine().split(" ");

			if(set[0].compareTo(set[1]) > 0) {
				taro += 3;
			} else if (set[0].compareTo(set[1]) < 0) {
				hanako += 3;
			} else {
				taro += 1;
				hanako += 1;
			}
		}
		System.out.println(taro + " " + hanako);
	}
}