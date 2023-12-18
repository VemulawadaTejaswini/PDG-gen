import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(bf.readLine());
		bf.close();

		int cnt = 1;
		int sum = 0;
		for(int i = 1;;i++) {
			sum += i;
			if(sum >= X) {
				System.out.println(cnt);
				break;
			}
			cnt++;
		}
	}
}