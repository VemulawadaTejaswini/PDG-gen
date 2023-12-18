import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] a) throws IOException {
		print();
	}

	private static void print() throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		String line = br.toString();
		int x = Integer.valueOf(line);
		boolean check = true;
		int i = 1;

		while(check){
			if(x == 0){
				check = false;
				break;
			}
			System.out.println("Case " + i + ": " + x + "\n");
			i++;
		}
	}

}