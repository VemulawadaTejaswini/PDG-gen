import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int kame = 0;
		int a = 0;
		int tsuru = X-kame;
		boolean flag = false;

		for(kame = 0;kame<=X;kame++) {
			a = Y - (kame*4 + tsuru*2);
		if(a==0) {
			flag = true;
			System.out.println("Yes");
		}
		}
		if(flag != true)
		System.out.println("No");

}
}
