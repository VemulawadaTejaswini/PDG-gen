import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String x = sc.nextLine();
			if(x.equals("0")) {
				break;
			}
			int sum = 0;
			String xary[] = x.split("");
			for (int i = 0; i < x.length(); i++) {
				sum += Integer.parseInt(xary[i]);
			}
			System.out.println(sum);
		}
	}

}