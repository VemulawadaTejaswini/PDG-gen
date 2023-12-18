import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String str = "";
			for (;;) {
				String input = reader.readLine();
				String[] array = input.split(" ");
				int m = Integer.parseInt(array[0]);
				int f = Integer.parseInt(array[1]);
				int r = Integer.parseInt(array[0]);
				int sum = m + f;
			
				if (m == -1 && f == -1 && r == -1) {
					break;
				} else if (m == -1 || f == -1) {
					// F
					str = str.concat("F\n");
				} else if (sum >= 80 ) {
					// A
					str = str.concat("A\n");
				} else if (sum >= 65 && sum < 80) {
					// B
					str = str.concat("B\n");
				} else if (sum >= 50 && sum < 65) {
					// C
					str = str.concat("C\n");
				} else if (sum >= 30 && sum < 30) {
					if (r >= 50) {
						// C
						str = str.concat("C\n");
					} else {
						// D
						str = str.concat("D\n");
					}					
				} else if (sum < 30) {
					str = str.concat("F\n");
				}
			}
			System.out.println(str);	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}