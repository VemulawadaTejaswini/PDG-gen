import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= 10000; i++) {
			int en = i * 1000;
			if(en >= n) {
				System.out.println(en-n);
				return;
			}
		}
	}
}