import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		Set<Integer> waters = new HashSet<>();
		Set<Integer> sugers = new HashSet<>();
		for(int i = 0 ; i <= f ; i++) {
			for(int j = 0 ; j <= f ; j++) {
				if(i * 100 * a + j * 100 * b <= f) waters.add(i * 100 * a + j * 100 * b);
			}
		}
		for(int i = 0 ; i <= f ; i++) {
			for(int j = 0 ; j <= f ; j++) {
				if(i * c + j * d <= f) sugers.add(i * c + j * d);
			}
		}
		int w = 1;
		int s = -1;
		for(int water : waters) {
			for(int suger : sugers) {
				if(water + suger <= f && e * water >= 100 * suger && suger * w > water * s) {
					w = water;
					s = suger;
				}
			}
		}
		System.out.println(s + w + " " + s);
	}
}