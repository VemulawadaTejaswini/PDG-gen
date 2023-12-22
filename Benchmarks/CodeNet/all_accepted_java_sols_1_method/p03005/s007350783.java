import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(k==1) {
			System.out.println(0);
		}else {
			System.out.println(n-k);
		}
	}

}
