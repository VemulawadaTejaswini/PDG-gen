import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int i;
		for(i = 1; i <= b; i++) {
			if((a * i - c) % b == 0) {
				break;
			}
		}
		if(i <= b) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
