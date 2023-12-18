import java.util.Scanner;


public class Main{

	static int[][] result;
	static boolean[] stillVisited;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		int[][] list = new int[cnt][cnt];
		stillVisited = new boolean[cnt];
		result = new int[cnt][2];
		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			stillVisited[i] = false;
			for(int j=0 ; j<tmp.length-2 ; j++) {
				list[Integer.parseInt(tmp[0])-1][j] = Integer.parseInt(tmp[j+2]);
			}
		}
		int c = 1;
		for(int i=0 ; i<cnt ; i++){
			c = dfs(list, i, c);
			c += 1;
		}
		for(int i=0 ; i<result.length ; i++) {
			System.out.println((i+1) + " " + result[i][0] + " " + result[i][1]);
		}
	}

	public static int dfs(int[][] list, int current, int cnt) {
		if(stillVisited[current]) {
			return cnt-1;
		}
		stillVisited[current] = true;
//		if(list[current][0]==0)
//			return cnt;
		//?????????????????????
		result[current][0] = cnt;
		for(int i=0 ; 0!=list[current][i] ; i++) {
			cnt = dfs(list, list[current][i]-1, cnt+1);
		}
		int returnV = cnt + 1;
		//?????????????????????
		result[current][1] = returnV;
		return returnV;
	}
}