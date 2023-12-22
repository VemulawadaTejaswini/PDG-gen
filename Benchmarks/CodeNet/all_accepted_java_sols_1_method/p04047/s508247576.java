import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String readline = br.readLine();
		readline = readline.trim();
		String[] stra = readline.split(" ");
		int[] inta = Stream.of(stra).mapToInt(Integer::parseInt).toArray();
		
		//for (int j = 0; j < inta.length; j++) {
		//	System.out.println(j.class);
		//}
		
		Arrays.sort(inta);
		//System.out.println(Arrays.toString(inta));
		
		int count = 0;
		for (int i = 0; i < N ; i++ ){
			count = count + inta[2 * i];
		}
		
		System.out.println(count);
	}
}