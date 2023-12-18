import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				StringTokenizer st = new StringTokenizer(buf);
				int m = Integer.parseInt(st.nextToken());
				int n = Integer.parseInt(st.nextToken());
				int player_list[] = new int[m];
				int now_player = 0;
				Arrays.fill(player_list,0);
				for (int i=1;i<=n;i++) {
					String ans = br.readLine();

					if (i%15==0) {
						if (!ans.equals("FizzBuzz")) player_list[now_player] = 1;
					} else if (i%3==0) {
						if (!ans.equals("Fizz")) player_list[now_player] = 1;
					} else if (i%5==0) {
						if (!ans.equals("Buzz")) player_list[now_player] = 1;
					} else {
						if (checkStringNumber(ans)) {
							if (Integer.parseInt(ans)!=i) player_list[now_player] = 1;
						} else {
							player_list[now_player] = 1;
						}
					}

					int c = 0;
					for (int j=0;j<m;j++) {
						if (player_list[j]==0) c++;
					}
					if (c==1) break;

					now_player = (now_player+1)%m;
					while (player_list[now_player]==1) {
						now_player = (now_player+1)%m;
					}
				}
				int cc = 0;
				for (int j=0;j<m;j++) {
					if (cc==0&&player_list[j]==0) {
						System.out.print(j+1);
						cc = 1;
					} else if (player_list[j]==0) {
						System.out.print(" "+(j+1));
					}
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkStringNumber(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}