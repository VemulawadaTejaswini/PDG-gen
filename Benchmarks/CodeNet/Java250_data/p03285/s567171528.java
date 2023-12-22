import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		for (int i=0; i<n; i++){
			if ((n-7*i) < 0){
				break;
			}

			if ((n-7*i) % 4 == 0){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		return;
	}
}