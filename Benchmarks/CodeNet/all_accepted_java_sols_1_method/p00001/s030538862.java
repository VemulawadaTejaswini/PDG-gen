import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws java.io.IOException
	{
		int[] is = new int[10];
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		for( int i = 0; i < 10; ++i){
			String c = r.readLine();
			is[i] = Integer.parseInt(c);
		}
		java.util.Arrays.sort(is);
		for (int i = 1; i <= 3; i++) {
			System.out.println(is[is.length-i]);
		}
	}
}