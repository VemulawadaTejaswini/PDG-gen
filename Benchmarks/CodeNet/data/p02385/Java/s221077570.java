

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice ref = new Dice();
		for (int i = 0; i < 6; i++) {
			ref.side[i] = sc.nextInt();
		}
		Dice d = new Dice();
		for (int i = 0; i < 6; i++) {
			d.side[i] = sc.nextInt();
		}


		int isCon = 0;
		isCon += d.tryCheckSequence(ref.side);

		d.rollN();
		isCon += d.tryCheckSequence(ref.side);
		d.rollN();
		isCon += d.tryCheckSequence(ref.side);
		d.rollW();
		isCon += d.tryCheckSequence(ref.side);
		d.rollE();
		isCon += d.tryCheckSequence(ref.side);
		d.rollE();
		isCon += d.tryCheckSequence(ref.side);
		
		if(isCon >= 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}
}

class Dice {
	int[] side = new int[6];

	public void getUpperSide() {
		System.out.println(this.side[0]);
	}

	public int getR(int top, int frt) {
		int[][] mtx = { { 0, 3, 5, 2, 4, 0 },
				{ 4, 0, 1, 6, 0, 3 },
				{ 2, 6, 0, 0, 1, 5 }, { 5, 1, 0, 0, 6, 2 },
				{ 3, 0, 6, 1, 0, 4 }, { 0, 4, 2, 5, 3, 0 } };
		int aI = top; //a Index of side[]
		int bI = frt; //b Index of side[]
		for (int i = 0; i < 6; i++) {
			if (top == this.side[i]) {
				aI = i;
			}
			if (frt == this.side[i]) {
				bI = i;
			}
			if (aI >= 0 && bI >= 0)
				break;
		}

		return (this.side[mtx[aI][bI] - 1]);
	}
	
	public int checkCon(int[] ref) {
		int isCon = 0;
		int cnt = 6;
		for (int i = 0; i < 6; i++) {
			if (this.side[i] == ref[i]) cnt--;
		}
		if(cnt == 0) {
			isCon = 1;
		}
		return(isCon);
	}

	public int tryCheckSequence(int[] ref) {
		int cnt = 0;
		cnt += checkCon(ref);
		for (int i = 0; i < 3; i++) {
			this.rotR();
			cnt += checkCon(ref);
		}
		return(cnt >= 1 ? 1 : 0);
	}

	public void rollE() {
		int w = this.side[5];
		this.side[5] = this.side[2];
		this.side[2] = this.side[0];
		this.side[0] = this.side[3];
		this.side[3] = w;
	}

	public void rollW() {
		int w = this.side[5];
		this.side[5] = this.side[3];
		this.side[3] = this.side[0];
		this.side[0] = this.side[2];
		this.side[2] = w;
	}

	public void rollN() {
		int w = this.side[5];
		this.side[5] = this.side[4];
		this.side[4] = this.side[0];
		this.side[0] = this.side[1];
		this.side[1] = w;
	}

	public void rollS() {
		int w = this.side[5];
		this.side[5] = this.side[1];
		this.side[1] = this.side[0];
		this.side[0] = this.side[4];
		this.side[4] = w;
	}

	public void rotR() {
		int w = this.side[1];
		this.side[1] = this.side[2];
		this.side[2] = this.side[4];
		this.side[4] = this.side[3];
		this.side[3] = w;
	}
}

