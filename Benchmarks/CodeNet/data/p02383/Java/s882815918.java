import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		SwitchDice dice = new SwitchDice(num);
		for (int i = 0; i < 6; i++) {
			num[i] = sc.nextInt();
		}
		dice.setFace(num);
		String str = sc.next();
		dice.order(str);
		System.out.println(dice.getFace());
		sc.close();
	}
}

class SwitchDice {

	private int face[] = new int[6];

	SwitchDice(int[] num) {
		for (int i = 0; i < 6; i++) {
			this.face[i] = num[i];
		}
	}

	public void order(String str) {
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

	public int getFace() {
		return face[0];
	}

	public void setFace(int[] face) {
		this.face = face;
	}
}
