import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			while ((x = in.readLine()).equals("-1 -1 -1") == false) {
				String[] points = x.split(" ");
				int m = Integer.parseInt(points[0]);
				int f = Integer.parseInt(points[1]);
				int r = Integer.parseInt(points[2]);

				if ((m == -1) || (f == -1)) {
					System.out.println("F");
				} else {
						if ((m + f) >= 80) System.out.println("A");
					if ((m + f) >= 65 && (m + f) < 80) System.out.println("B");
					if ((m + f) >= 50 && (m + f) < 65) System.out.println("C");
					if ((m + f) >= 30 && (m + f) < 50) {
						if (r >= 50) System.out.println("C");
						else System.out.println("D");
					}
					if ((m + f) < 30) System.out.println("F");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}