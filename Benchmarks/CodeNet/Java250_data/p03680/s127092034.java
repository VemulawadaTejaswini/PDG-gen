import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		int next =1;

		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			if(array[next-1] == 2) {
				System.out.println(i+1);
				System.exit(0);
			}
			next = array[next-1];
		}
		System.out.println(-1);
	}
	public static int sample() {
		return 1;
	}

}
