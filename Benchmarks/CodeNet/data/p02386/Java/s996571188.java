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
						if(d4.a[0] == face[i][0] && d4.a[1] == face[i][1] && d4.a[2] == face[i][2]
								&& d4.a[3] == face[i][3] && d4.a[4] == face[i][4] && d4.a[5] == face[i][5]) {
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
	int a[] = new int[6];
	int temp;
	Dice4(int face[]){
		for(int i = 0; i < 6; i++) {
			a[i] = face[i];
		}
	}

	void roll(char c) {
		switch(c) {
		case 'E':
			temp = a[5];
			a[5] = a[2];
			a[2] = a[0];
			a[0] = a[3];
			a[3] = temp;
			break;
		case 'N':
			temp = a[5];
			a[5] = a[4];
			a[4] = a[0];
			a[0] = a[1];
			a[1] = temp;
			break;
		case 'S':
			temp = a[5];
			a[5] = a[1];
			a[1] = a[0];
			a[0] = a[4];
			a[4] = temp;
			break;
		case 'W':
			temp = a[5];
			a[5] = a[3];
			a[3] = a[0];
			a[0] = a[2];
			a[2] = temp;
			break;
		}
	}
	void rota() {  //横方向の回転をさせるメソッド
		temp = a[1];
		a[1] = a[2];
		a[2] = a[4];
		a[4] = a[3];
		a[3] = temp;
	}
}
