import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr;
		int n, arr[];

		n = Integer.parseInt(br.readLine());
		boolean result = true;

		Dice[] diceArr = new Dice[n];

		for(int i = 0;i < n;i++){
			strArr = br.readLine().split(" ");
			arr = new int[6];
			for(int j = 0;j < 6;j++){
				arr[j] = Integer.parseInt(strArr[j]);
			}
			diceArr[i] = new Dice(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
		}

		Loop:for(int i = 0;i < n;i++){
			for(int j = i + 1;j < n;j++){
				if(diceArr[i].equals(diceArr[j])){
					result = false;
					break Loop;
				}
			}
		}

		if(result)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

class Dice {
	int[] num;

	{
		num = new int[6];
	}

	Dice(int a, int b, int c, int d, int e, int f) {
		super();
		num[0] = a;
		num[1] = b;
		num[2] = c;
		num[3] = d;
		num[4] = e;
		num[5] = f;
	}

	public int getTop() {
		return new Integer(num[0]);
	}

	public int getFront() {
		return new Integer(num[1]);
	}

	public int getRight() {
		return new Integer(num[2]);
	}

	public int getIndex(int n) {
		for (int i = 0; i < num.length; i++) {
			if (n == num[i])
				return i;
		}
		return -1;
	}

	void roll(String s) {
		for (int i = 0; i < s.length(); i++) {
			roll(s.charAt(i));
		}
	}

	void roll(char c) {
		int[] temp = new int[6];
		switch (c) {
		case 'N':
			temp[0] = num[1];
			temp[1] = num[5];
			temp[2] = num[2];
			temp[3] = num[3];
			temp[4] = num[0];
			temp[5] = num[4];
			break;
		case 'W':
			temp[0] = num[2];
			temp[1] = num[1];
			temp[2] = num[5];
			temp[3] = num[0];
			temp[4] = num[4];
			temp[5] = num[3];
			break;
		case 'E':
			temp[0] = num[3];
			temp[1] = num[1];
			temp[2] = num[0];
			temp[3] = num[5];
			temp[4] = num[4];
			temp[5] = num[2];
			break;
		case 'S':
			temp[0] = num[4];
			temp[1] = num[0];
			temp[2] = num[2];
			temp[3] = num[3];
			temp[4] = num[5];
			temp[5] = num[1];
			break;
		default:
		}
		num = temp;
	}

	void top(int index) {
		switch (index) {
		case 0:
			return;
		case 1:
			roll("N");
			return;
		case 2:
			roll("W");
			return;
		case 3:
			roll("E");
			return;
		case 4:
			roll("S");
			return;
		case 5:
			roll("NN");
			return;
		}
	}

	void turn() {
		roll("ESW");
	}


	@Override
	public boolean equals(Object obj) {
		Dice dice = (Dice)obj;
		int[] pips = this.num.clone();

		boolean isEqual = false;
		L1:for (int pip : pips) {
			this.top(this.getIndex(pip));
			int index = dice.getIndex(this.getTop());
			if (index == -1) {
				continue;
			} else {
				dice.top(index);
				for (int i = 0; i < 4; i++) {
					dice.turn();
					if (Arrays.equals(this.num, dice.num)) {
						isEqual = true;
						break L1;
					}
				}
			}
		}
		return isEqual;
	}

}