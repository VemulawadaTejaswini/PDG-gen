import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
//		sc.useDelimiter("\\r*\\n*,*");
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
		sc.nextLine();
		for (int i=0; i < hl; i++) {
			String[] line = sc.nextLine().split(",");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
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