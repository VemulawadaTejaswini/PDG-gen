import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Integer[] Ints = new Integer[10];
		for (int i=0; i<10; i++) {
			Ints[i] = sc.nextInt();
		}
		Arrays.sort(Ints,Comparator.reverseOrder());
		for (int i=0; i<3; i++) {
			System.out.println(Ints[i]);
		}
	}
}
