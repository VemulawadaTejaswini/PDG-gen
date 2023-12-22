import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int d = sc.nextInt();
		int sum=0;
		for(int i=L;i<=R;i++) {
			if(i%d==0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}