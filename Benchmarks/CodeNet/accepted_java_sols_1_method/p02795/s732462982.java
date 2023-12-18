import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int line = w;
			int column = h;
			int ans = 0;
			int total = 0;
			while(total < n) {
				if(line >= column) {
					total += line;
					column--;
				} else {
					total += column;
					line--;
				}
				ans++;
			}
			System.out.println(ans);
		}

	}

}
