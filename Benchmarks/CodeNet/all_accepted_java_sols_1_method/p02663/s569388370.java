import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h1 = s.nextInt(), m1 = s.nextInt(), h2 = s.nextInt(), m2 = s.nextInt(), k = s.nextInt();
		int time = (h2 - h1) * 60 + (m2 - m1);
		System.out.println(Math.max(0, time - k));

	}
	
	

}
