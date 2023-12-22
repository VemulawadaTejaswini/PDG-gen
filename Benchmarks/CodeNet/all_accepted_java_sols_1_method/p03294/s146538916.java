
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int answer=0;
	static String str[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		
		for(String num:str) {
			answer += Integer.parseInt(num);
		}
		
		answer -= length;

		System.out.println(answer);

	}

}
