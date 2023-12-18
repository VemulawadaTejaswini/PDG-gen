import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Dice dice1 = new Dice(sc);
		Dice dice2 = new Dice(sc);
		boolean a = false;
		
		a = a || Dice.check(dice1, dice2);
		dice1.turnN();
		a = a || Dice.check(dice1, dice2);
		dice1.turnE();
		a = a || Dice.check(dice1, dice2);
		dice1.turnE();
		a = a || Dice.check(dice1, dice2);
		dice1.turnE();
		a = a || Dice.check(dice1, dice2);
		dice1.turnN();
		a = a || Dice.check(dice1, dice2);
		
		if(a) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

class Dice{
	int[] s = new int[4];
	int[] t = new int[2];
	
	Dice(Scanner sc) {
		t[0] = sc.nextInt();
		s[0] = sc.nextInt();
		s[3] = sc.nextInt();
		s[1] = sc.nextInt();
		s[2] = sc.nextInt();
		t[1] = sc.nextInt();
	}
	
	static boolean check(Dice dice1, Dice dice2){
		boolean a = false;
		
		if(dice2.t[0] == dice2.t[0]) {
			for(int its = 0; its < 4; its++) {
				if(dice2.s[0] == dice1.s[its]) {
					if(dice2.s[1] == dice1.s[(its+1)%4] 
						&& dice2.s[2] == dice1.s[(its+2)%4] 
						&& dice2.s[3] == dice1.s[(its+3)%4] 
						&& dice2.t[1] == dice1.t[1]) {
						a = true;
					}
				}
			}
		}
		
		return a;
	}
	
	void turnN() {
		int x = t[0];
		t[0] = s[0];
		s[0] = t[1];
		t[1] = s[2];
		s[2] = x;
	}
	
	void turnS() {
		int x = t[0];
		t[0] = s[2];
		s[2] = t[1];
		t[1] = s[0];
		s[0] = x;
	}
	
	void turnE() {
		int x = t[0];
		t[0] = s[1];
		s[1] = t[1];
		t[1] = s[3];
		s[3] = x;
	}
	
	void turnW() {
		int x = t[0];
		t[0] = s[3];
		s[3] = t[1];
		t[1] = s[1];
		s[1] = x;
	}
}
