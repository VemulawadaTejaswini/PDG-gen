
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[2];
		try {
			String str = br.readLine();
			String[] array = str.split(" ");
			for (int i = 0; i < array.length; i++) {
				num[i] = Integer.parseInt(array[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		int answer =(int)Math.log10( num[0]+num[1])+ 1;
		System.out.println(answer);
	}
}