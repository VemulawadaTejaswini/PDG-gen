import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		int cnt = 0;
		for(int i = 0;i < M;i++) {
			for(int j = 9;j < D;j++) {
				if((j+1)/10 >= 2 &&
						(j+1)%10 >= 2 &&
						(i+1) == ((j+1)/10)*((j+1)%10)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}