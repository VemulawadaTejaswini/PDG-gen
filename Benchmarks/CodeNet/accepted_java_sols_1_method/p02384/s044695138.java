import java.util.Scanner;

public class Main {
	public	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[6];
		for (int i = 0; i < 6; i++) {
			dice[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a==dice[1]&&b==dice[2])||(a==dice[3]&&b==dice[1])||(a==dice[4]&&b==dice[3])||(a==dice[2]&&b==dice[4])) {
				System.out.println(dice[0]);
			}else if((a==dice[0]&&b==dice[3])||(a==dice[2]&&b==dice[0])||(a==dice[5]&&b==dice[2])||(a==dice[3]&&b==dice[5])) {
				System.out.println(dice[1]);
			}else if((a==dice[0]&&b==dice[1])||(a==dice[4]&&b==dice[0])||(a==dice[5]&&b==dice[4])||(a==dice[1]&&b==dice[5])) {
				System.out.println(dice[2]);
			}else if((a==dice[0]&&b==dice[4])||(a==dice[1]&&b==dice[0])||(a==dice[5]&&b==dice[1])||(a==dice[4]&&b==dice[5])) {
				System.out.println(dice[3]);
			}else if((a==dice[0]&&b==dice[2])||(a==dice[3]&&b==dice[0])||(a==dice[5]&&b==dice[3])||(a==dice[2]&&b==dice[5])) {
				System.out.println(dice[4]);
			}else {
				System.out.println(dice[5]);
			}
		}
	}
}

