import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int array[] = new int[M];

		for(int i = 0; i < M; i++) {
			array[i] = sc.nextInt();
		}
		int x = 0;
		for(int j = 0; j < M; j++) {
			if(array[j] < X) {
				x += 1;
			}else {
				x += 0;
			}
		}

		System.out.println(Math.min(x, M-x));
	}

}
