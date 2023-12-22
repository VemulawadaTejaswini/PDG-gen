import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i=0; i<=3000; i++) {
			for(int j=0; j<=3000; j++) {
				if((N - R*i - G*j)%B==0 && (N - R*i - G*j)>=0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
