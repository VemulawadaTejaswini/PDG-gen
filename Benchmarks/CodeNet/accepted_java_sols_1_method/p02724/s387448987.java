import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

      	int th = x/500;
      	int g = (x - (th*500))/5;

		int ans =(th*1000)+(g*5);

		System.out.println(ans);

		sc.close();
	}
}