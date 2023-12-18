import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i]=sc.nextInt();
		}
		int J = 0;

		for(int i = 0; i < N; i++) {
			if(list[i]%2==0) {
				if(list[i]%3==0||list[i]%5==0) {
				}else {
					J = -1;
				}
			}else {
			}
		}

		if(J==0) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
	}
}