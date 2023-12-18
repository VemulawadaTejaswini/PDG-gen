import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		Dice dice = new Dice(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
		dice.roll(br.readLine());
		System.out.println(dice.getFace());
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

	public int getFace() {
		return new Integer(num[0]);
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

}