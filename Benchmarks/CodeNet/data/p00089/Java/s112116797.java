import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static int max = 0;

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] s = new int[100][51];
		int yp = 0;

		for (int i=0;i<100;i++)	{
			Arrays.fill(s[i],-1);
		}

		try {
			s[yp++][0] = Integer.parseInt(br.readLine());

			int xp = 0;
			while (true) {
				StringTokenizer st = new StringTokenizer(br.readLine(),",");
				int count = st.countTokens();
				for (int i=0;i<count;i++) {
					s[yp][xp++] = Integer.parseInt(st.nextToken());
				}
				if (count==1) break;
				xp = 0;
				yp++;
			}

			//check_s(s,yp);

			max_sum(s,0,0,yp,s[0][0]);
			System.out.println(max);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void max_sum(int[][] s,int y,int x,int max_y,int sum) {
		if (y==max_y) {
			if (max<sum) max = sum;
		} else if (y<(max_y/2)+1) {
			max_sum(s,y+1,x,max_y,sum+s[y+1][x]);
			max_sum(s,y+1,x+1,max_y,sum+s[y+1][x+1]);
		} else {
			if (x>=1) max_sum(s,y+1,x-1,max_y,sum+s[y+1][x-1]);
			if (s[y+1][x]!=-1) max_sum(s,y+1,x,max_y,sum+s[y+1][x]);
		}
	}

	public static void check_s(int[][] s,int yp) {
		for (int i=0;i<=yp;i++) {
			int j = 0;
			while (s[i][j]!=-1) System.out.print(s[i][j++]);
			System.out.println();
		}
	}
}