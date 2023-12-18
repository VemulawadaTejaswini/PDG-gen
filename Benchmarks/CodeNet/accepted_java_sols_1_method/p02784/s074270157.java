import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int H = stdIn.nextInt();
		int N = stdIn.nextInt();
		int sum = 0;
		for(int i=0 ;i<N;i++) {
			sum += stdIn.nextInt();
		}
		if(sum>=H) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
