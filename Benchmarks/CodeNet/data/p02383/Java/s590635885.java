import java.util.Scanner;

public class Main {

	private static int face[] = new int[6];

	static void dice(int[] num) {
		for (int i = 0; i < 6; i++) {
			Main.face[i] = num[i];
		}
	}

	static void order(String str) {
		char[] order = str.toCharArray();
		int tmp;
		for (int i = 0; i < order.length; i++) {
			switch (order[i]) {
			case 'N':
				tmp = face[0];
				face[0] = face[1];
				face[1] = face[5];
				face[5] = face[4];
				face[4] = tmp;
				break;
			case 'S':
				tmp = face[0];
				face[0] = face[4];
				face[4] = face[5];
				face[5] = face[1];
				face[1] = tmp;
				break;
			case 'E':
				tmp = face[0];
				face[0] = face[3];
				face[3] = face[5];
				face[5] = face[2];
				face[2] = tmp;
				break;
			case 'W':
				tmp = face[0];
				face[0] = face[2];
				face[2] = face[5];
				face[5] = face[3];
				face[3] = tmp;
				break;
			}
		}
	}

	public static int getFace() {
		return Main.face[0];
	}

	public static void setFace(int[] face) {
		Main.face = face;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}
		Main.setFace(num);
		String str = sc.next();
		Main.order(str);
		System.out.println(Main.getFace());
		sc.close();
	}
}
