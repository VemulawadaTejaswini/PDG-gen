import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int debt = 100000;
		while(n-- != 0) {
			debt += debt*0.05;
			int a = debt%1000;
			if(a != 0) debt += 1000-a;
		}
		System.out.println(debt);
	}
}

