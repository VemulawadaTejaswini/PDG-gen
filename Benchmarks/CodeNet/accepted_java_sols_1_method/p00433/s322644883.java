import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ascore[] = br.readLine().split(" ");
		String bscore[] = br.readLine().split(" ");
		int a = 0;
		int b = 0;
		for(int i=0; i<4; i++){
			a += Integer.parseInt(ascore[i]);
			b += Integer.parseInt(bscore[i]);
		}

		System.out.println(Math.max(a, b));
	}
}