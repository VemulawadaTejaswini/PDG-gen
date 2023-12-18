import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			char[] c = br.readLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < c.length; i++) {
				if(i == 4){
					System.out.print(" ");
				}

				System.out.print(c[i]);
			}
			System.out.println();
		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}
}