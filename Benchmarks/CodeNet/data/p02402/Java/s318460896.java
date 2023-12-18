import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ns = sc.nextLine();
		String[] array = sc.nextLine().split(" ");
		int[] iarray = new int[Integer.parseInt(ns)];
		for (int i = 0; i < array.length; i++) {
			iarray[i] = Integer.parseInt(array[i]);
		}
		int min = 0;
		int max = 0;
		int sum = 0;
		for (int i : iarray) {
			if (min > i) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
			sum += i;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}