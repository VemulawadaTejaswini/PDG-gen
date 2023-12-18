import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int r = sc.nextInt();
			int c = sc.nextInt();
			if(r==0 && c==0) break;
			
			int[][] map = new int[r][c];
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					map[i][j] = sc.nextInt();
				}
			}

			int max = 0;
			int num = -1;
			int sum, count;
			for(int i=0;i<r;i++){
				sum = 0;
				for(int j=0;j<r;j++){
					count = 0;
					if(i!=j){
						for(int k=0;k<c;k++){
							if(map[i][k]==map[j][k]) count++;
						}
						if(count<=c/2) count = c - count;
						sum += count;
					}
				}
				if(max<sum){
					max = sum;
					num = i;
				}
			}
			
			for(int i=0;i<r;i++){
				if(i!=num){
					count = 0;
					for(int j=0;j<c;j++){
						if(map[i][j]==map[num][j]) count++;
					}
					if(count<=c/2){
						for(int j=0;j<c;j++){
							if(map[i][j]==0) map[i][j] = 1;
							else map[i][j] = 0;
						}
					}
				}
			}
			
			sum = 0;
			for(int i=0;i<c;i++){
				count = 0;
				for(int j=0;j<r;j++){
					if(map[j][i]==0) count++;
				}
				if(count<=r/2) count = r - count;
				sum += count;
			}
			
			System.out.println(sum);
		}	
	}	
}