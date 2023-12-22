import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cake = 4;
		int donut = 7;
		for(int i=0;i<=(N/cake);i++) {
			for(int j=0;j<=((N-i*cake)/donut);j++) {
				if(cake*i+donut*j==N) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
