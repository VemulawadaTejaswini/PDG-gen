import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		if(n%2 == 1 && k%2 == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}