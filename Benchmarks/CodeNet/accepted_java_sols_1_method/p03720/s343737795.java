import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] country = new int[sc.nextInt()];
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int point = sc.nextInt()-1;
			country[point] = country[point]+1;
			point = sc.nextInt()-1;
			country[point] = country[point]+1;
		}
		for (int i : country) {
			System.out.println(i);
		}
	}

}
