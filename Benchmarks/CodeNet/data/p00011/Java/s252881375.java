import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\r*\\n*,*");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(a);
//		System.out.println(b);
		int vl = sc.nextInt();
		int[] state = new int[vl+1];
		for (int i=1; i <= vl; i++) {
			state[i] = i;
		}

		int hl = sc.nextInt();
		for (int i=0; i < hl; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			amida(state, a, b);
		}

		for (int i=1; i <= vl; i++) {
			System.out.println(state[i]);
		}
	}

	public static void amida(int[] state, int pa, int pb) {
		int temp;
		temp = state[pa];
		state[pa] = state[pb];
		state[pb] = temp;
	}
}