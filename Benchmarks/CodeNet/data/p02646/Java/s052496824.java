import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int demon = scanner.nextInt();
		int demonvelo = scanner.nextInt();
		int escaper = scanner.nextInt();
		int escapervelo = scanner.nextInt();
		int time = scanner.nextInt();

		for(int i = 1; i <= time; i++) {
			if(demon > escaper) {
				demon -= demonvelo;
				escaper -= escapervelo;
				if(demon < escaper) {
					System.out.println("YES");
					System.exit(0);
				}
			}else if(demon < escaper) {
				demon += demonvelo;
				escaper += escapervelo;
				if(demon > escaper) {
					System.out.println("YES");
					System.exit(0);
				}
			}else if(demon == escaper) {
				System.out.println("YES");
				System.exit(0);
			}
		}

		System.out.println("NO");

		scanner.close();
	}
}
