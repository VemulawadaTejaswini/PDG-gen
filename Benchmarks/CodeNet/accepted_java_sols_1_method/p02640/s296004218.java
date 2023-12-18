import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int turu = 2;
		int  kame = 4;
		int temp = x*turu;
		if(y < temp) {
			System.out.println("No");
		return ;
		}
		if((y-temp)%2==1) {
			System.out.println("No");
		return ;
		}
		if(temp*2<y) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}