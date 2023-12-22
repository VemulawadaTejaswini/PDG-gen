import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 10000;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int c = 0;
			while(a%2==0) {
				a/=2;
				c++;
			}
			min = Math.min(min, c);
		}
		System.out.println(min);
	}
}