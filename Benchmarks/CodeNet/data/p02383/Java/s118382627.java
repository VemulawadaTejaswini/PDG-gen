import java.util.Scanner;

public class Main {
	public	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[7];
		int tmp;
		for (int i = 0; i < 6; i++) {
			dice[i] = sc.nextInt();
		}
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch(c){
				case 'E':
					tmp = dice[0];
					dice[0] = dice[3];
					dice[3] = dice[5];
					dice[5] = dice[2];
					dice[2] = tmp;
					break;
				case 'W':
					tmp = dice[0];
					dice[0] = dice[2];
					dice[2] = dice[5];
					dice[5] = dice[3];
					dice[3] = tmp;
					break;
				case 'N':
					tmp = dice[0];
					dice[0] = dice[1];
					dice[1] = dice[5];
					dice[5] = dice[4];
					dice[4] = tmp;
				break;				
				case 'S':
					tmp = dice[0];
					dice[0] = dice[4];
					dice[4] = dice[5];
					dice[5] = dice[1];
					dice[1] = tmp;
					break;
			}
		}
		System.out.println(dice[0]);
	}
}

