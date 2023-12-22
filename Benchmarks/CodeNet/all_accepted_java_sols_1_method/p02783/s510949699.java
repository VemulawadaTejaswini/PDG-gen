import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int HP = sc.nextInt();
		int A = sc.nextInt();
		
		int cnt = 0;
		for(;;) {
			HP -= A;
			cnt++;
			if(HP <= 0) {
				break;
			}
		}

		System.out.print(cnt);

		sc.close();

	}

}