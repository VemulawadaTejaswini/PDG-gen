import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		//Scanner scan = new Scanner(System.in);
		String[] str1 = line.split(",");


			System.out.print(str1[0]);
			System.out.print(" ");
			System.out.print(str1[1]);
			System.out.print(" ");
			System.out.print(str1[2]);

	}
}
