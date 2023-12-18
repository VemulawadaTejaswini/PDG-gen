import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] dice = new int[6];
	int[] temp = new int[4];
	int[] num = new int[4];
	
	void change() {
		for (int i = 0; i < 4; i++)
			temp[i] = dice[num[i]];
		for (int i = 0; i < 4; i++)
			dice[num[i]] = temp[(i+1)%4];
	}
	
	void run() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			dice[0] = 1; dice[1] = 2;dice[2] = 3; dice[3] = 5; dice[4] = 4; dice[5] = 6;
			String s;
			int res = 1;
			for (int i = 0; i < n; i++) {
				s = sc.next();
				switch (s.charAt(0)) {
				case 'N':
					num[0] = 0; num[1] = 1; num[2] = 5; num[3] = 3;
					break;
				case 'E':
					num[0] = 0; num[1] = 4; num[2] = 5; num[3] = 2;
					break;
				case 'W':
					num[0] = 0; num[1] = 2; num[2] = 5; num[3] = 4;
					break;
				case 'S':
					num[0] = 0; num[1] = 3; num[2] = 5; num[3] = 1;
					break;
				case 'R':
					num[0] = 1; num[1] = 2; num[2] = 3; num[3] = 4;
					break;
				case 'L':
					num[0] = 1; num[1] = 4; num[2] = 3; num[3] = 2;
					break;
				}
				change();
				res += dice[0];
			}
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}