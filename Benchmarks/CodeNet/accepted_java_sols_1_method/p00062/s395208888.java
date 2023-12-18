import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			int[][] map = new int[10][10];
			
			for(int i=0;i<10;i++){
				map[0][i] = Integer.valueOf(s.substring(i,i+1));
			}
			
			for(int i=1;i<10;i++){
				for(int j=0;j<10-i;j++){
					map[i][j] = (map[i-1][j] + map[i-1][j+1])%10;
				}
			}
			
			System.out.println(map[9][0]);

		}
	
	}	
}