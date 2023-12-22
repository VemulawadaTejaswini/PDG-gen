import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();
		long hp = H;
		long cnt = 1;
		long monster = 1;
		while (true) {
			if (hp == 1) {
				break;
			}
			else {
				hp /= 2;
				monster *= 2;
				cnt += monster;
			}
		}
		System.out.println(cnt);
	}
}