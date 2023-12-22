import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] array = str.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		int d = Integer.parseInt(array[3]);

		int[] list = {a, b, c, d};
		Arrays.sort(list);
		int[] diff = {1, 4, 7, 9};
		if(Arrays.equals(list, diff)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}