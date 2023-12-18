import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//B: Brave Force Story
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] move = {{0, 1}, {1, 1}, {-1, 0}, {1, 0}, {-1, -1}, {0, -1}};
		while(true){
			int t = sc.nextInt();
			int n = sc.nextInt();
			if(t==0&&n==0)break;
			boolean[][] map = new boolean[200][200];
			while(n--!=0){
				int x = sc.nextInt()+100;
				int y = sc.nextInt()+100;
				map[x][y] = true;
			}
			int x = sc.nextInt()+100;
			int y = sc.nextInt()+100;
			map[x][y] = true;
			int c = 1;
			List<int[]> list = new ArrayList<int[]>();
			list.add(new int[]{x, y});
			while(t--!=0){
				List<int[]> next = new ArrayList<int[]>();
				for(int[] a:list){
					for(int k=0;k<6;k++){
						int nx = a[0]+move[k][0];
						int ny = a[1]+move[k][1];
						if(!map[nx][ny]){
							map[nx][ny] = true;
							c++;
							next.add(new int[]{nx, ny});
						}
					}
				}
				list = next;
			}
			System.out.println(c);
		}
	}
}