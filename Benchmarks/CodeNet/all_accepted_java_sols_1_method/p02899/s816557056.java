import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();

		int[] list = new int[N];

		for (int index=0; index<N; index++) {
			int num = sc.nextInt();
			list[num-1]=index;
		}
		for (int index=0; index<N; index++) {
			System.out.print(list[index]+1);
			System.out.print(" ");
		}
		System.out.println();
	}
}