
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = A-2*B;
		if(ans>=0) {
			System.out.println(ans);
		}else {
			System.out.println(0);
		}
	}

}

