import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int[][] students = new int[n][n];
			boolean[][] tallest = new boolean[n][n];
			boolean[][] shortest = new boolean[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					students[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < n; i++){
				int columnMax = 0;
				for(int j = 0; j < n; j++)
					columnMax = Math.max(columnMax, students[j][i]);
				for(int j = 0; j < n; j++){
					if(columnMax == students[j][i]){
						tallest[j][i] = true;
						break;
					}
				}
			}
			for(int i = 0; i < n; i++){
				int rowMin = Integer.MAX_VALUE;
				for(int j = 0; j < n; j++)
					rowMin = Math.min(rowMin, students[i][j]);
				for(int j = 0; j < n; j++){
					if(rowMin == students[i][j]){
						shortest[i][j] = true;
						break;
					}
				}
			}
			
			boolean noAns = true;
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(shortest[i][j] && tallest[i][j]){
						sb.append(students[i][j] + " ");
						noAns = false;
					}
				}
			}
			
			if(noAns){
				System.out.println(0);
			}else{
				sb.deleteCharAt(sb.length() - 1);
				System.out.print(sb);
			}
		}
		
	}
}