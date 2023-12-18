import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			br.readLine();
			String[] str_array = br.readLine().split(" ");
			for(int i = str_array.length -1 ; i >= 0 ; i--) {
				System.out.printf("%s", str_array[i]);
				if (i != 0) System.out.printf(" ");
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

