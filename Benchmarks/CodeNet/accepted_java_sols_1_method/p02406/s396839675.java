import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			String x = String.valueOf(i);
			if (i % 3 == 0 || x.indexOf("3") != -1){
				System.out.print(" " + i);
			}
		}
		System.out.println("");
	}

}