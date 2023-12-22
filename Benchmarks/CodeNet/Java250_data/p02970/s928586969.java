import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int now = D*2+1;
		int count =1;
		while(N>now) {
			now +=D*2+1;
			count++;
		}
		System.out.println(count);
	}
}
