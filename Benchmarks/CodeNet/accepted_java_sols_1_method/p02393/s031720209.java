import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] ab = x.split(" ");
		
		int[] a = new int[3];
		a[0] = Integer.parseInt(ab[0]);
		a[1] = Integer.parseInt(ab[1]);
		a[2] = Integer.parseInt(ab[2]);
		
		Arrays.sort(a);
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}