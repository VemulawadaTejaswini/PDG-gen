
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Double> p = new PriorityQueue<>();
		
		for (int i = 0; i < n; i++) {
			p.add(sc.nextDouble());
		}
		
		double tmp = 0;
		for (int i = 0; i < n - 1; i++) {
			if (p.size() == 1) {
				break;
			}
			tmp = (p.poll() + p.poll()) / 2;
			p.add(tmp);
		}
		
		System.out.println(tmp);
	}
}