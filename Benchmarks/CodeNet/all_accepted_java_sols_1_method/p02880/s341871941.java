import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean can = false;
		for(int i=1; i<10; i++) {
			if(n%i==0 && 1<=n/i && n/i<=9) {
				can = true;
				break;
			}
		}
		if(can) System.out.println("Yes");
		else System.out.println("No");
	}

}