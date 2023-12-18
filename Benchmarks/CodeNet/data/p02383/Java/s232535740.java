import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		Dice d = new Dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		char[] cmd = sc.next().toCharArray();
		
		for (int i = 0; i < cmd.length; i++) {
			if (cmd[i] == 'N') {
				d.N();
			} else if (cmd[i] == 'S') {
				d.S();
			} else if (cmd[i] == 'E') {
				d.E();
			} else if (cmd[i] == 'W') {
				d.W();
			}
		}

		System.out.println(d.now());

		sc.close();
	}
	
	private static class Dice {
		int[] s;
		int up;
		int north;
		int east;

		Dice(int s1, int s2, int s3, int s4, int s5, int s6) {
			s = new int[6];
			s[0] = s1;
			s[1] = s2;
			s[2] = s3;
			s[3] = s4;
			s[4] = s5;
			s[5] = s6;
			up = 1;
			north = 5;
			east = 3;
		}
		
		void N() {
			int temp = 7 - north;
			north = up;
			up = temp;
		}
		
		void S() {
			int temp = 7 - up;
			up = north;
			north = temp;
		}
		
		void E() {
			int temp = 7 - east;
			east = up;
			up = temp;
		}

		void W() {
			int temp = 7 - up;
			up = east;
			east = temp;
		}
		
		int now() {
			return s[up - 1];
		}
	}
}