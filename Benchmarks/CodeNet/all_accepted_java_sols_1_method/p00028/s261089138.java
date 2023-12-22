import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int[] a = new int[100];
	int max = 0;
	while (in.hasNextInt()) {
	 int read = in.nextInt() - 1;
	 a[read]++;
	 if (max < a[read]) {
		max++;
	 }
	}
	for (int i = 0; i < a.length; i++) {
	 if (a[i] == max) {
		System.out.println(i + 1);
	 }
	}
 }
}