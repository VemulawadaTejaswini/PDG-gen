import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int demon = scanner.nextInt();
		int demonvelo = scanner.nextInt();
		int escaper = scanner.nextInt();
		int escapervelo = scanner.nextInt();
		int time = scanner.nextInt();

		if(demon == escaper) {
			System.out.println("YES");
			System.exit(0);
		}

		for(int i = 1; i <= time; i++) {
			if(demon > escaper) {
				demon -=demonvelo;
				escaper -= escapervelo;
			}else if(demon < escaper) {
				demon += demonvelo;
				escaper += escapervelo;
			}else if(demon == escaper) {
				break;
			}
		}

		if(demon == escaper) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

		scanner.close();
	}
}
