import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int p=0;p<N;p++) {
			for(int q=0;q<N;q++) {
				if(4*p+7*q==N) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}