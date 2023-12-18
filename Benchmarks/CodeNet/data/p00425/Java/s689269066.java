import java.util.*;
public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while (true) {
			Dice dice = new Dice();
			int n = sc.nextInt();
			if(n == 0) break;
			int cnt = 1;
			for(int i=0;i<n;i++) {
				dice.roll(sc.next());
//				System.out.println(dice.getFace(0));
				cnt += dice.getFace(0);
			}
			System.out.println(cnt);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Dice {
		int[] dice;		// {top,front,right,left,back,bottom}
		Dice() {
			dice = new int[6];
			for(int i=0;i<6;i++) dice[i] = i+1;
		}
		void roll(String d) {
			if(d.equals("North")) roll_N();
			else if(d.equals("South")) roll_S();
			else if(d.equals("West")) roll_W();
			else if(d.equals("East")) roll_E();
			else if(d.equals("Right")) roll_R();
			else roll_L();
		}
		
		void roll_N() {
			roll(0,1,5,4);
		}
		void roll_S() {
			roll(0,4,5,1);
		}
		void roll_W() {
			roll(0,2,5,3);
		}
		void roll_E() {
			roll(0,3,5,2);
		}
		void roll_R() {
			roll(1,2,4,3);
		}
		void roll_L() {
			roll(1,3,4,2);
		}
		
		void roll(int face1, int face2, int face3, int face4 ) {
			int tmp = dice[face1];
			dice[face1] = dice[face2];
			dice[face2] = dice[face3];
			dice[face3] = dice[face4];
			dice[face4] = tmp;
		}
		
		int getFace(int n ) {
			return dice[n];
		}
		
	}
	
}