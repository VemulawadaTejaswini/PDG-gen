import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		int res = 0;
		if(n % 1000 == 0)
			res = 0;
		else
			res = Math.abs(n % 1000 - 1000);
		System.out.println(res);
	}

}