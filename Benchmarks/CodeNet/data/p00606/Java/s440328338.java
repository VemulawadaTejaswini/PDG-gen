import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run2();
    }
	double allCount = 0;
	double ansCount = 0;
	int[] dx = {-1,0,0,1};
	int[] dy = {0,-1,1,0};
	int s;
	int t;
	int b;
	int n;
	int[][][][] memo;
	public void run2(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = Integer.parseInt(scan.nextLine());
			if(n == 0){
				break;
			}
			allCount = 0;
			ansCount = 0;
			char[] ch = scan.nextLine().replaceAll(" ","").toCharArray();
			s = (ch[0] - 'A');
			t = ch[1] - 'A';
			b = ch[2] - 'A';
			memo = new int[n+1][2][3][3];
			for(int i = 0;i < n+1;i++){
				for(int j = 0;j < 3;j++){
					for(int k = 0;k < 3;k++){
						memo[i][0][j][k] = -1;
						memo[i][1][j][k] = -1;
					}
				}
			}
			int[] ans = dfs2(s/3,s%3,0);
			System.out.printf("%.6f\n",(double)ans[1] / (double)ans[0]);
		}
	}
	public int[] dfs2(int y,int x,int count){
		int[] a = {0,0};
		if(memo[count][0][x][y] >= 0){
			a[0] += memo[count][0][x][y];
			a[1] += memo[count][1][x][y];
			return a;
		}
		if(count == n){
			memo[count][0][x][y] = a[0] = 1;
			memo[count][1][x][y] = a[1] = 0;
			if(x == t % 3 && y == t/3){
				memo[count][1][x][y] = a[1] = 1;
			}
			return a;
		}
		int[] c = new int[2];
		for(int i = 0;i < 4;i++){
			if(x+dx[i] >= 0 && x+dx[i] < 3 && y+dy[i] >= 0 && y+dy[i] < 3){
				if(x+dx[i] == b % 3 && y+dy[i] == b / 3){
					c = dfs2(y,x,count+1);
				}else{
					c = dfs2(y+dy[i],x+dx[i],count+1);
				}
			}else{
				c = dfs2(y,x,count+1);
			}
			a[0] += c[0];
			a[1] += c[1];
			memo[count][0][x][y] = a[0];
			memo[count][1][x][y] = a[1];
		}
		return a;
	}
}