import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int demon = scanner.nextInt();
		int demonvelo = scanner.nextInt();
		int escaper = scanner.nextInt();
		int escapervelo = scanner.nextInt();
		int time = scanner.nextInt();

		if(demon > escaper) {
			if(demon-demonvelo*time > escaper-escapervelo*time) {
				System.out.println("NO");
			}else if(demon-demonvelo*time < escaper-escapervelo*time) {
				System.out.println("YES");
			}
		}else if(demon < escaper) {
			if(demon+demonvelo*time > escaper+escapervelo*time) {
				System.out.println("YES");
			}else if(demon+demonvelo*time < escaper+escapervelo*time) {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}