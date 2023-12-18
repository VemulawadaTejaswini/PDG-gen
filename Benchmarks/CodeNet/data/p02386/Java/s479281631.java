import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<Dice> DiceList = new ArrayList<Dice>();
		String hantei,match="Yes";

		int count = sc.nextInt();

		for(int i=0; i<count; i++) {
			DiceList.add(new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}

		for(int i=0; i<DiceList.size(); i++) {
			for(int x=0; x<DiceList.size(); x++) {
				if(x!=i) {
				hantei=hantei(DiceList.get(i),DiceList.get(x));
				if(hantei.equals("Yes")){
					match ="No";
				}
				}
			}
		}
		System.out.println(match);
	}
	static String hantei(Dice dice1,Dice dice2 ) {
		String shijirow = "EEENEEENEEESEEESEEENEEEN";
		for(int i =0; i<shijirow.length(); i++) {
			if(dice2.equals(dice1)) {
				return "Yes";
			}
			dice1.roll(shijirow.charAt(i));
		}
		return "No";
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

		if (up != other.up) {
			return false;
		}


		if (front != other.front) {
			return false;
		}


		if (left != other.left) {
			return false;
		}

	
		if (right != other.right) {
			return false;
		}


		if (back != other.back) {
			return false;
		}


		if (down != other.down) {
			return false;
		}
		return true;
	}
}

