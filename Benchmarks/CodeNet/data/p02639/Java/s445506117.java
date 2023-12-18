import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ans = -1;
		int[] A = new int[5];
		for(int i=0; i<5; i++) {
			A[i] = sc.nextInt();
			if(A[i] == 0) {
				ans = i+1;
			}
		}

		System.out.println(ans);

	}

}
