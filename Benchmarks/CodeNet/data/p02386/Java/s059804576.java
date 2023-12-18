import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int face[][] = new int[n][6];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 6; j++) {
				face[i][j] = sc.nextInt();
			}
		}

		char com[] = new char[] {'E', 'N', 'E', 'N', 'E', 'N'};

		//2つめのサイコロをDiceクラスのインスタンスとして考える
		boolean frag = false;  //判定が終了したらtrueにする

		for(int i = 0; i < n-1; i++) {
			for(int j = i + 1; j < n; j++) {
				Dice4 d4 = new Dice4(face[j]);

				for(int k = 0; k < 6; k++) {  //rollのループ //なぜ7回の操作が必要なのか？
					for(int l = 0; l < 4; l++) {  //rotaのループ
						if(d4.getNum(0) == face[i][0] && d4.getNum(1) == face[i][1] && d4.getNum(2) == face[i][2]
								&& d4.getNum(3) == face[i][3] && d4.getNum(4) == face[i][4] && d4.getNum(5) == face[i][5]) {
							frag = true;
							break;
						}
						if(frag == true) break;
						d4.rota();
					}
					if(frag == true) break;
					d4.roll(com[k]);
				}
				if(frag == true) break;
			}
			if(frag == true) break;
		}
		if(frag) System.out.println("No");
		else System.out.println("Yes");
	}
}

class Dice4{
	private int a[] = new int[6];
	private int temp;

	Dice4(int face[]){
		for(int i = 0; i < 6; i++) {
			this.a[i] = face[i];
		}
	}

	public void roll(char c) {
		switch(c) {
		case 'E':
			temp = this.a[5];
			this.a[5] = this.a[2];
			this.a[2] = this.a[0];
			this.a[0] = this.a[3];
			this.a[3] = temp;
			break;
		case 'N':
			temp = a[5];
			this.a[5] = this.a[4];
			this.a[4] = this.a[0];
			this.a[0] = this.a[1];
			this.a[1] = temp;
			break;
		case 'S':
			temp = this.a[5];
			this.a[5] = this.a[1];
			this.a[1] = this.a[0];
			this.a[0] = this.a[4];
			this.a[4] = temp;
			break;
		case 'W':
			temp = this.a[5];
			this.a[5] = this.a[3];
			this.a[3] = this.a[0];
			this.a[0] = this.a[2];
			this.a[2] = temp;
			break;
		}
	}
	public void rota() {  //横方向の回転をさせるメソッド
		temp = this.a[1];
		this.a[1] = this.a[2];
		this.a[2] = this.a[4];
		this.a[4] = this.a[3];
		this.a[3] = temp;
	}

	public int getNum(int i) {
		return this.a[i];
	}
}
