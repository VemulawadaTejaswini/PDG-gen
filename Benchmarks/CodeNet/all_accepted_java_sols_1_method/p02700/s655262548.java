
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer tHP = sc.nextInt();
		Integer tAT = sc.nextInt();
		Integer aHP = sc.nextInt();
		Integer aAT = sc.nextInt();

		while(tHP > 0 && aHP > 0) {
			aHP = aHP - tAT;
			tHP = tHP - aAT;
		}
		
		if(aHP <= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
