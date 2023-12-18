import java.util.Scanner;

class Dice{
	public int Top;
	public int Front;
	public int Right;
	public int left;
	public int Back;
	public int Bottom;

	public void SC() {
		Scanner sc = new Scanner(System.in);
		Top = sc.nextInt();
		Front = sc.nextInt();
		Right = sc.nextInt();
		left = sc.nextInt();
		Back = sc.nextInt();
		Bottom = sc.nextInt();
		sc.close();
	}
	public void W(Dice st) {
		Top = st.Right;
		Front = st.Front;
		Right = st.Bottom;
		left = st.Top;
		Back = st.Back;
		Bottom = st.left;
	}
	public void E(Dice st) {
		Top = st.left;
		Front = st.Front;
		Right = st.Top;
		left = st.Bottom;
		Back = st.Back;
		Bottom = st.Right;
	}

	public void S(Dice st) {
		Top = st.Back;
		Front = st.Top;
		Right = st.Right;
		left = st.left;
		Back = st.Bottom;
		Bottom = st.Front;
	}

	public void N(Dice st) {
		Top = st.Front;
		Front = st.Bottom;
		Right = st.Right;
		left = st.left;
		Back = st.Top;
		Bottom = st.Back;
	}
}


public class s10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice a = new Dice();
		Dice st = new Dice();
		a.SC();
		st = a;
		String str = sc.next();

		char data[] = new char[str.length()];
		data = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			switch(data[i]) {
			case 'W':
				a.W(st);
				st = a;
				break;
			case'S':
				a.S(st);
				st = a;
				break;
			case'N':
				a.N(st);
				st = a;
				break;
			case'E':
				a.E(st);
				st = a;
				break;
			default:
				break;
			}
		}


		System.out.println(a.Top);

		sc.close();
	}
}


