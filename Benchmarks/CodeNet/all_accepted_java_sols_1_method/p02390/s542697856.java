import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		System.out.print(S/3600);
		System.out.print(":");
		System.out.print(S%3600/60);
		System.out.print(":");
		System.out.println(S%3600%60);

	}
}