import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int i=0,j=0;

			int n = sc.nextInt();
			if(n == 0) break;
			int s = sc.nextInt();
			int g = sc.nextInt();
			int d = sc.nextInt();

			char[][] map = new char[d][n-1];
			for(i=0;i<d;i++){
				map[i] = sc.next().toCharArray();
			}

			if(reachable(map,s,g)){
				System.out.println(0);
				continue;
			}

			boolean flg = true;
			for(i=0;flg && i<d;i++){
				for(j=0;flg && j<n-1;j++){
					if(map[i][j] == '0' && (j-1<0 || map[i][j-1] == '0') && (j+1>=n-1 || map[i][j+1] == '0')){
						map[i][j] = '1';
						if(reachable(map,s,g)) flg = false;
						map[i][j] = '0';
					}
				}
			}

			if(!flg) System.out.println(i + " " + j);
			else System.out.println(1);
		}
	}

	private static boolean reachable(char[][] map,int s,int g){
		int i = 0, j = s - 1;

		while(i < map.length){
			if(j < map[0].length && map[i][j] == '1')
				j++;
			else if(j - 1 >= 0 && map[i][j-1] == '1')
				j--;

			i++;
		}

		return j == g - 1;
	}
}