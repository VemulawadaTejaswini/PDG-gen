import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int n = b - a;
		int tHeight = 0;
		
		for(int i = 1; i <= n; i++) {
			tHeight += i;
		}
		
		int sHeight = tHeight - b;
		
		System.out.println(sHeight);
	}
}