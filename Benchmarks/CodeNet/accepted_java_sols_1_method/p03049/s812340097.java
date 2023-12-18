import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int x = 0, y = 0, z = 0;

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String s = sc.next();

			//A---B
			for (int j = 0; j < s.length() - 1; j++) {
				if(s.charAt(j) == 'A' && s.charAt(j + 1) == 'B') cnt++;
			}

			if(s.charAt(0) == 'B' && s.charAt(s.length() - 1) == 'A') x++;		//B---A
			else if(s.charAt(s.length() - 1) == 'A') y++;	//----A
			else if(s.charAt(0)== 'B') z++;	//B----

		}

		int ans = 0;
		if (x != 0) {
			if(y == 0 && z == 0)
				ans = x - 1;
			else
				ans = Math.min(y, z) + x;
		} else {
			ans = Math.min(y, z);
		}

		//System.out.println(cnt + " " + x + " " + y + " " + z);

		System.out.println(ans + cnt);
	}

}