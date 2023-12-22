
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] favorite = new int[M];
		
		for (int i = 0; i < N; i++) {
			int num = scan.nextInt();
			for (int j = 0; j < num; j++) {
				int fn = scan.nextInt();
				favorite[fn - 1]++;
			}
		}
		
		int count = 0;
		for (int i = 0; i < favorite.length; i++) {
			if (favorite[i] == N) {
				count++;
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}
}