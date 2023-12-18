import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Dice dice1 = new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		Dice dice2 = new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		String hantei = "No";

		String shijirow = "EEENEEENEEESEEESEEENEEEN";
		for(int i =0; i<shijirow.length(); i++) {
			if(dice2.equals(dice1)) {
				hantei="Yes";
				break;
			}
			dice1.roll(shijirow.charAt(i));
		}
		System.out.println(hantei);
	}
}

class Dice {
	int up =1;
	int front = 2;
	int left = 3;
	int right = 4;
	int back = 5;
	int down = 6;

	Dice(){};

	Dice(int up,int front,int left,int right, int back, int down){
		this.up = up;
		this.front = front;
		this.left =left;
		this.right = right;
		this.back = back;
		this.down = down;

	}


	void roll(char Shiji) {
		int  tmp;
		switch(Shiji) {
		case 'N':{
			tmp = up;
			this.up = this.front;
			this.front = this.down;
			this.down = this.back;
			this.back = tmp;
			break;
		}
		case 'E':{
			tmp = this.up;
			this.up = this.right;
			this.right = this.down;
			this.down = this.left;
			this.left = tmp;
			break;
		}
		case 'W':{
			tmp = this.up;
			this.up = this.left;
			this.left = this.down;
			this.down = this.right;
			this.right = tmp;
			break;
		}
		case 'S':{
			tmp = this.up;
			this.up = this.back;
			this.back = this.down;
			this.down = this.front;
			this.front = tmp;
			break;
		}
		}

	}
	 public boolean equals(Object obj) {
		 Dice other = (Dice) obj;

		 // booleanの場合は==で比較する
		 if (up != other.up) {
		 return false;
		 }

		 // byteの場合は==で比較する
		 if (front != other.front) {
		 return false;
		 }

		 // charの場合は==で比較する
		 if (left != other.left) {
		 return false;
		 }

		 // shortの場合は==で比較する
		 if (right != other.right) {
		 return false;
		 }

		 // intの場合は==で比較する
		 if (back != other.back) {
		 return false;
		 }

		 // longの場合は==で比較する
		 if (down != other.down) {
		 return false;
		 }
		 return true;
	 }
}

