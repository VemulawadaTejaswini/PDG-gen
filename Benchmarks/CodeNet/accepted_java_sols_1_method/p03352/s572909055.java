import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X= sc.nextInt();
		int answer = 1;
		if (X <= 3) {
			System.out.println("1");
		} else {
			for (int i = 2 ; i <= 31; i++) {
				int candidate = i;
				while ( candidate * i <= X) {
					candidate *= i ;
					answer = Math.max(answer, candidate);
			}

		}
			System.out.println(answer);
		}

}
}