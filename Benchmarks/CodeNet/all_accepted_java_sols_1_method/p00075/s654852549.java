import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] s = sc.next().split(",");
			double w = Double.parseDouble(s[1]);
			double h = Double.parseDouble(s[2]);
			if(w / (h * h) >= 25.0) {
				System.out.println(s[0]);
			}
		}
		sc.close();
	}
}
