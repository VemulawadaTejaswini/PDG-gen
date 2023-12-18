import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] lines =  sc.nextLine().split("");
			int sum = 0;
			for(int i = 0;i < lines.length;i++) {
				sum += Integer.parseInt(lines[i]);
			}
			if(sum == 0) {
				break;
			}
			System.out.println(sum);
		}
	}
}