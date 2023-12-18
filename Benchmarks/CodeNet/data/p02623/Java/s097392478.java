import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int time = sc.nextInt();
		int[] books = new int[a + b];
		for (int i = 0; i < books.length; i++) {
			books[i] = sc.nextInt();
		}
		Arrays.sort(books);
		int sum = 0, count = 0;
		for (int i = 0; sum + books[i] < time; i++) { 
			sum += books[i];
			count++;
		}
		System.out.println(count);
	}
}