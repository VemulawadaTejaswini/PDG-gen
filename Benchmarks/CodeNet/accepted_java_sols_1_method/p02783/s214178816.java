import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		int cnt = 0;
		while(H > 0){
			H -= A;
			cnt++;
		}
		System.out.println(cnt);

	}

}