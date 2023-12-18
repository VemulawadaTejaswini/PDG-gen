import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int demon = scanner.nextInt();
		int demonvelo = scanner.nextInt();
		int escaper = scanner.nextInt();
		int escapervelo = scanner.nextInt();
		int time = scanner.nextInt();

		for(int i = 0; i <= time; i++) {
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
