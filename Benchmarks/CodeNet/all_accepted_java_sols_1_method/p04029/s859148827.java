import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ret = 0;
		
		for (int i=1; i<=n; i++) {
			ret = ret + i;
		}
		
		System.out.println(ret);
		sc.close();
	}

}