import java.util.*;
public class Main {
	public static void main(String[] args) {	
		Integer a[] = new Integer[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a, Collections.reverseOrder());
		System.out.print(a[0]);
		for(int i = 1; i < 5; i++) {
			System.out.printf(" %d", a[i]);
		}
		System.out.println();
	}
}