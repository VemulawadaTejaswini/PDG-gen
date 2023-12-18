import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, m, n;
		int [] Pasta = new int[3];
		int [] Pasta1 = new int[3];
		int [] Juice = new int[2];
		int [] Juice1 = new int[2];
		for(i = 0; i < 3; i++){
			Pasta[i] = sc.nextInt();
		}
		for(i = 0; i < 2; i++){
			Juice[i] = sc.nextInt();
		}
		for(i = 0; i < 3; i++){
			n = 0;
			for (j = 0; j < 3; j++) {
				if (Pasta[j] < Pasta[i]) {
				n++;
				}
			}
			Pasta1[n] = Pasta[i];
		}
		for(i = 0; i < 2; i++){
			m = 0;
			for (j = 0; j < 2; j++) {
				if (Juice[j] < Juice[i]) {
				m++;
				}
			}
			Juice1[m] = Juice[i];
		}
		System.out.println(Pasta1[0] + Juice1[0] - 50);
	}
}