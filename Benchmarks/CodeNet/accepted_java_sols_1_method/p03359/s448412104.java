import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int takahashi = 0;

		for (int i=1; i<=a; i++){
			if (i < a || i <= b){
				takahashi++;
			}
		}
		System.out.println(takahashi);
	}

}
