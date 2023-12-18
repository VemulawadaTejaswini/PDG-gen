

import java.util.Scanner;

class Dice{
	public int Top;
	public int Front;
	public int Right;
	public int left;
	public int Back;
	public int Bottom;

	public Dice() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void W() {
		int Topch = Top;
		int leftch = left;
		Top = Right;
		Right = Bottom;
		left = Topch;
		Bottom = leftch;
	}
	public void E() {
		int Topch = Top;
		int Rightch = Right;
		Top = left;
		Right = Topch;
		left = Bottom;
		Bottom = Rightch;
	}

	public void S() {
		int Topch  =Top;
		int Frontch = Front;
		Top = Back;
		Front = Topch;
		Back = Bottom;
		Bottom = Frontch;
	}

	public void N() {
		int Topch = Top;
		int Backch = Back;
		Top = Front;
		Front = Bottom;
		Back = Topch;
		Bottom = Backch;
	}

	public void test(Dice b) {
		if(this.Top==b.Top&&this.Front==b.Front&&this.Right==b.Right&&this.left==b.left&&this.Back==b.Back&&this.Bottom==b.Bottom) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}


}

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice a = new Dice();
		Dice b = new Dice();
		a.Top = sc.nextInt();
		a.Front = sc.nextInt();
		a.Right = sc.nextInt();
		a.left = sc.nextInt();
		a.Back = sc.nextInt();
		a.Bottom = sc.nextInt();


		b.Top = sc.nextInt();
		b.Front = sc.nextInt();
		b.Right = sc.nextInt();
		b.left = sc.nextInt();
		b.Back = sc.nextInt();
		b.Bottom = sc.nextInt();
		int n=1;
		String str = "";
		int test1,test2;
		for(int i=0;i<n;i++){
			test1 = b.Top;
			test2 = b.Front;

			if(test1 == a.Front){
				str = str +"N";
			}else if(test1 == a.Right){
				str = str + "W";
			}else if(test1 == a.left){
				str = str + "E";
			}else if(test1 == a.Back){
				str = str + "S";
			}else if(test1 == a.Bottom){
				str = str + "NN";
			}

			char data[] = new char[str.length()];
			data = str.toCharArray();
			for(int j=0;j<str.length();j++) {
				switch(data[j]) {
				case 'W':
					a.W();
					break;
				case'S':
					a.S();
					break;
				case'N':
					a.N();
					break;
				case'E':
					a.E();
					break;
				default:
					break;
				}
			}
			str = "";
			if(test2 == a.Right){
				str = str + "WSE";
			}else if(test2 == a.left){
				str = str + "ESW";
			}else if(test2 == a.Back){
				str = str + "SSEE";
			}
			data = str.toCharArray();
			for(int j=0;j<str.length();j++) {
				switch(data[j]) {
				case 'W':
					a.W();
					break;
				case'S':
					a.S();
					break;
				case'N':
					a.N();
					break;
				case'E':
					a.E();
					break;
				default:
					break;
				}
			}
			a.test(b);
			
			str = "";
		}

		sc.close();
	}
}

