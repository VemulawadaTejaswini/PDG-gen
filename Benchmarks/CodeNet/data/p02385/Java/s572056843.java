import java.util.Arrays;
import java.util.Scanner;

class Daice{
	int mas[];
	Daice(int[] mas){
		this.mas = mas;
	}

	void north() {
		int temp = mas[4];
		mas[4] = mas[0];
		mas[0] = mas[1];
		mas[1] = mas[5];
		mas[5] = temp;
	}

	void south() {
		int temp = mas[0];
		mas[0] = mas[4];
		mas[4] = mas[5];
		mas[5] = mas[1];
		mas[1] = temp;
	}

	void east() {
		int temp = mas[0];
		mas[0] = mas[3];
		mas[3] = mas[5];
		mas[5] = mas[2];
		mas[2] = temp;
	}

	void west() {
		int temp = mas[0];
		mas[0] = mas[2];
		mas[2] = mas[5];
		mas[5] = mas[3];
		mas[3] = temp;
	}

	int umen(int usam, int msam) {
		int u = 0;
		int m = 0;
		for(int i = 0; i < this.mas.length; i++) {
			if(this.mas[i] == usam) {
				u = i + 1;
			}
		}

		for(int i = 0; i < this.mas.length; i++) {
			if(this.mas[i] == msam) {
				m = i + 1;
			}
		}

		if(u == 1) {
			if(m == 2) {
				return 3;
			}else if(m == 3) {
				return 5;
			}else if(m == 4) {
				return 2;
			}else {
				return 4;
			}
		}else if(u == 2) {
			if(m == 1) {
				return 4;
			}else if(m == 3) {
				return 1;
			}else if(m == 4) {
				return 6;
			}else {
				return 3;
			}
		}else if(u == 3) {
			if(m == 1) {
				return 2;
			}else if(m == 2) {
				return 6;
			}else if(m == 5) {
				return 1;
			}else {
				return 5;
			}
		}else if(u == 4) {
			if(m == 1) {
				return 5;
			}else if(m == 2) {
				return 1;
			}else if(m == 5) {
				return 6;
			}else {
				return 2;
			}
		}else if(u == 5) {
			if(m == 1) {
				return 3;
			}else if(m == 3) {
				return 6;
			}else if(m == 4) {
				return 1;
			}else {
				return 4;
			}
		}else {
			if(m == 2) {
				return 4;
			}else if(m == 3) {
				return 2;
			}else if(m == 4) {
				return 5;
			}else {
				return 3;
			}
		}
	}

	void turn() {
		int temp = this.mas[1];
		this.mas[1] = this.mas[2];
		this.mas[2] = this.mas[4];
		this.mas[4] = this.mas[3];
		this.mas[3] = temp;
	}
}

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};

		Daice d = new Daice(m);

		int m2[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};

		Daice d2 = new Daice(m2);

		int top = 0;


		for(int i = 0; i < d2.mas.length; i++) {
			if(d.mas[0] == d2.mas[i]) {
				top = i + 1;
				break;
			}
		}
		if(d.mas[0] == d.mas[1] && d.mas[1] == d.mas[2]) {
			d.mas[1] = d.mas[5];
			d.mas[5] = d.mas[2];
			top = 1;
		}

		if(top == 6) {
			d2.south();
			d2.south();
		}else if(top == 5) {
			d2.south();
		}else if(top == 4){
			d2.east();
		}else if(top == 3) {
			d2.west();
		}else if(top == 2) {
			d2.north();
		}

		int mae = 0;

		for(int i = 1; i < 5; i++) {
			if(d.mas[1] == d2.mas[i]) {
				mae = i + 1;
				break;
			}
		}
		if(mae == 0) {
			System.out.println("No");
		}

		if(mae == 3) {
			d2.turn();
		}else if(mae == 4) {
			d2.turn();
			d2.turn();
			d2.turn();
		}else if(mae == 5){
			d2.turn();
			d2.turn();
		}else {

		}
		if(Arrays.equals(d.mas, d2.mas)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
