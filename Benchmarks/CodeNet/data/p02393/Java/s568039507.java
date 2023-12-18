import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		for (int i=0; i<3; i++) {
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		for (int num : a) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}