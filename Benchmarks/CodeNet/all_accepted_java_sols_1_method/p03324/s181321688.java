import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int D = scan.nextInt();
		int N = scan.nextInt();
		scan.close();
		if(D == 0) {
			if(N == 100) {
				System.out.println(N + 1);
			}else {
				System.out.println(N);
			}
		}else if(D == 1){
			if(N == 100) {
				System.out.println(N * 101);
			}else {
				System.out.println(N * 100);
			}
		}else {
			if(N == 100) {
				System.out.println(N * 10100);
			}else {
				System.out.println(N * 10000);
			}
		}
	}
}
