import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int z = x*y;
		int a = x+x+y+y;
		System.out.println(z + " " + a);

	}
}