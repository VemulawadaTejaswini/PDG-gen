import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int a,b;
	static int[][] field;

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};

		while(true){
			b=s.nextInt();
			a=s.nextInt();
			if(a==0)System.exit(0);
			boolean[][] map = new boolean[a][b];
			field = new int[2*a-1][];


			for(int i=0; i<2*a-1; i++) {
				if(i%2==1) {
					field[i] = new int[b];
					for(int j=0; j<b; j++) {
						field[i][j] = s.nextInt();
					}
				} else {

					field[i] = new int[b-1];
					for(int j=0; j<b-1; j++) {
						field[i][j] = s.nextInt();
					}
				}
			}

			ArrayList<int[]> list = new ArrayList<int[]> ();
			list.add(new int[] {0,0});

			int answer = 0,step=1;

			map[0][0] = true;

			while(!list.isEmpty()) {
				ArrayList<int[]> next = new ArrayList<int[]>();
				for(int[] k:list) {
					if(k[0]==a-1 && k[1]==b-1) {
						answer = step;
						break;
					}

					for(int p=0; p<4; p++) {
						int ni = k[0]+move[p][0];
						int nj = k[1]+move[p][1];

						if((0<=ni && ni<a) && (0<=nj && nj<b) && (!map[ni][nj])) {
							if(p==0 && field[k[0]*2][k[1]]==0) {
								map[ni][nj] = true;
								next.add(new int[] {ni,nj});
							}
							else if(p==1 && field[ni*2][nj]==0) {
								map[ni][nj] = true;
								next.add(new int[] {ni,nj});
							}
							else if(p==2 && field[k[0]*2+1][k[1]]==0) {
								map[ni][nj] = true;
								next.add(new int[] {ni,nj});
							}
							else if(p==3 && field[ni*2+1][nj]==0) {
								map[ni][nj] = true;
								next.add(new int[] {ni,nj});
							}
						}

					}
				}
				list = next;
				step++;
			}
			System.out.println(answer);
		}
	}

}

