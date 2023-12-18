
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String strA = bufferedReader.readLine();
		String strB = bufferedReader.readLine();

		String[] list = strA.split("");
		String reA = list[2] + list[1] + list[0];

		if(strB.equals(reA)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
