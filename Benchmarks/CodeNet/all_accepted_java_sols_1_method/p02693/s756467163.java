import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int K = a.nextInt();
		int A = a.nextInt();
		int B = a.nextInt();
		int num = 0;
		for(int i = A ; i <= B; i++) {
			if(i % K == 0) {
				num++;
			}
		}
		if(num > 0) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
}