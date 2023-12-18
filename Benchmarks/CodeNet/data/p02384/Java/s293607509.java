
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Cube cube = new Cube(br);
		char[] act = br.readLine().toCharArray();
		cube.roll(act);
		System.out.println(cube.top);
	}
}

class Cube {
	String[] num;
	String top;
	String center;
	String back;
	String bottom;
	String right;
	String left;
	String temp;

	Cube(BufferedReader br) throws IOException {
		num = br.readLine().split(" ");
		this.top = num[0];
		this.center = num[1];
		this.right = num[2];
		this.left = num[3];
		this.back = num[4];
		this.bottom = num[5];
	}

	void south() {
		temp = this.top;
		this.top = this.back;
		this.back = this.bottom;
		this.bottom = this.center;
		this.center = temp;
	}

	void north() {
		temp = this.top;
		this.top = this.center;
		this.center = this.bottom;
		this.bottom = this.back;
		this.back = temp;
	}

	void east() {
		temp = this.top;
		this.top = this.left;
		this.left = this.bottom;
		this.bottom = this.right;
		this.right = temp;
	}

	void west() {
		temp = this.top;
		this.top = this.right;
		this.right = this.bottom;
		this.bottom = this.left;
		this.left = temp;
	}

	void roll(char[] act) {
		for (int i = 0; i < act.length; i++) {
			switch (act[i]) {
			case 'S':
				south();
				break;
			case 'N':
				north();
				break;
			case 'E':
				east();
				break;
			case 'W':
				west();
				break;
			}
		}
	}
}