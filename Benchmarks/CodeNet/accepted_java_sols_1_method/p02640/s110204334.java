import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if (Y%2 == 1) {
			System.out.println("No");
		} else {
			int tat = 2*X;
			int bi = 4*X;
			if (tat <= Y && Y <= bi) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}