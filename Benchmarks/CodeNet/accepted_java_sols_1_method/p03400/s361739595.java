import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int array[] = new int[N];

		int chocolate = 0;

		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
			chocolate += (D-1)/array[i];
		}
		chocolate += X + N;
		System.out.println(chocolate);
	}

}
