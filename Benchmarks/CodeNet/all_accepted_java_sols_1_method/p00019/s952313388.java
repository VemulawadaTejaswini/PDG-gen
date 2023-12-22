import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = 1;
		long n = sc.nextInt();
		for(int i = (int)n ; i >= 1 ; i--){
			a = i * a;

		}
		System.out.println(a);
		sc.close();
	}

}