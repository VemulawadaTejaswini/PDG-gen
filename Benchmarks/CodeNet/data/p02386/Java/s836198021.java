

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

	public Boolean test(Dice b) {
		if(this.Top==b.Top&&this.Front==b.Front&&this.Right==b.Right&&this.left==b.left&&this.Back==b.Back&&this.Bottom==b.Bottom) {
			return true;
		}else {
			return false;
		}

	}


}

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0,j=0;
		int f=0;
		Dice a[];
		int n=sc.nextInt();
		a = new Dice[n];
		for(i =0;i<n;i++)a[i]=new Dice();

		for(i =0;i<n;i++) {
			a[i].Top = sc.nextInt();
			a[i].Front = sc.nextInt();
			a[i].Right = sc.nextInt();
			a[i].left = sc.nextInt();
			a[i].Back = sc.nextInt();
			a[i].Bottom = sc.nextInt();
		}

		for(i=0;i<n;i++) {
			for(j=1;j<n;j++) {
				if(i==j)break;
				String str = "";
				int test1,test2;
				test1 = a[j].Top;
				test2 = a[j].Front;

				if(test1 == a[i].Front){
					str = str +"N";
				}else if(test1 == a[i].Right){
					str = str + "W";
				}else if(test1 == a[i].left){
					str = str + "E";
				}else if(test1 == a[i].Back){
					str = str + "S";
				}else if(test1 == a[i].Bottom){
					str = str + "NN";
				}

				char data[] = new char[str.length()];
				data = str.toCharArray();
				for(int t=0;t<str.length();t++) {
					switch(data[t]) {
					case 'W':
						a[j].W();
						break;
					case'S':
						a[j].S();
						break;
					case'N':
						a[j].N();
						break;
					case'E':
						a[j].E();
						break;
					default:
						break;
					}
				}
				str = "";
				if(test2 == a[i].Right){
					str = str + "WSE";
				}else if(test2 == a[i].left){
					str = str + "ESW";
				}else if(test2 == a[i].Back){
					str = str + "SSEE";
				}
				data = str.toCharArray();
				for(int t=0;t<str.length();t++) {
					switch(data[t]) {
					case 'W':
						a[j].W();
						break;
					case'S':
						a[j].S();
						break;
					case'N':
						a[j].N();
						break;
					case'E':
						a[j].E();
						break;
					default:
						break;
					}
				}
				if(a[i].test(a[j])&&f==0) {
					System.err.println("No");
					f=1;
					break;
				}
			}
			if(f!=0)break;
		}
		if(f==0) System.err.println("Yes");
		sc.close();
	}
}




