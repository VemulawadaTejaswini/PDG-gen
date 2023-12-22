import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		StringBuffer gyaku = null;

		try {
			gyaku = new StringBuffer(br.readLine());
			gyaku = gyaku.reverse();
			System.out.println(gyaku);
		} catch (IOException e) {
			System.out.println("error");
		}
	}
}