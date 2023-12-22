import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int cnt=0;

		if(a==b) {
			cnt++;
		}
		if(a==c) {
			cnt++;
		}
		if(b==c) {
			cnt++;
		}

		//System.out.println(cnt);
		if(cnt == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();

	}

}