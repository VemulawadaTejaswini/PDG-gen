import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			while(A % 2 == 0) {
				cnt++;
				A /= 2;
			}
		}
		System.out.println(cnt);
	}
}