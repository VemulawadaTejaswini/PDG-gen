import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();
		long f = sc.nextLong();
		long wa = -1;
		long su = -1;
		Set<Long> waterList = new HashSet<>();
		Set<Long> sugerList = new HashSet<>();
		for(int i = 0 ; 100 * i * a <= f ; i++) {
			for(int j = 0 ; 100 * i * a + 100 * b * j <= f ; j++) {
				waterList.add(100 * i * a + 100 * j * b);
			}
		}
		for(int i = 0 ; i * c <= f ; i++) {
			for(int j = 0 ; i * c + j * d <= f ; j++) {
				sugerList.add(i * c + j * d);
			}
		}
		for(long water : waterList) {
			for(long suger : sugerList) {
				if(water + suger <= f && e * water >= 100 * suger && suger * wa > su * water) {
					wa = water;
					su = suger;
				}
			}
		}
		System.out.println(wa + su + " " + su);
	}
}