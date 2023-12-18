import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int [] array = new int[7];
		int i = 0;
		while(true) {
			array[i] = Integer.parseInt(read.readLine());
			if (0 == array[i]) {
				break;
			}
			System.out.println("Case " + (i + 1) +": "+array[i]);
			i++;
		}
	}
	
}