
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dice d = new Dice();
		for(int i = 0; i < 6; i++) {
			d.side[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			d.getRightSide(a, b);
		}
		
		sc.close();
	}
}

class Dice {
	int[] side = new int[6];

	public void getUpperSide() {
		System.out.println(this.side[0]);
	}
	public void getRightSide(int a, int b) {
		int[][] mtx = {{0, 3, 5, 2, 4, 0}, {4, 0, 1, 6, 0, 3}, 
{2, 6, 0, 0, 1, 5}, {5, 1, 0, 0, 6, 2}, {3, 0, 6, 1, 0, 4}, {0, 4, 2, 5, 3, 2, 0}};
		int aI = -1;
		int bI = -1;
		for(int i = 0; i < 6; i++) {
			if(a==this.side[i]) {
				aI = i;
			}
			if(b==this.side[i]) {
				bI = i;
			}
			if(aI>=0&&bI>=0) break;
		}
		System.out.println(this.side[mtx[aI][bI] - 1]);
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
}
