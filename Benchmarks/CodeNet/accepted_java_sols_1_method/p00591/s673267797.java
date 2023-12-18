import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int[][] students = new int[n][n];
			int[][] x = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					students[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < n; i++){
				int columnMax = -1;
				for(int j = 0; j < n; j++){
					if(columnMax < students[j][i])
						columnMax = students[j][i];
				}
				for(int j = 0; j < n; j++){
					if(columnMax == students[j][i])
						x[j][i] |= 2;
				}
			}
			for(int i = 0; i < n; i++){
				int rowMin = Integer.MAX_VALUE;
				for(int j = 0; j < n; j++){
					if(rowMin > students[i][j])
						rowMin = students[i][j];
				}
				for(int j = 0; j < n; j++){
					if(rowMin == students[i][j])
						x[i][j] |= 1;
				}
			}
			
			Set<Integer> both = new HashSet<Integer>();
            for(int i = 0;i < n;i++)
                for(int j = 0;j < n;j++)
                    if(x[i][j] == 3)
                        both.add(students[i][j]);
			
            if(both.size() == 1){
            	StringBuilder sb = new StringBuilder();
                for(int v : both){
                    sb.append(v + " ");
                }
                sb.deleteCharAt(sb.length() - 1);
                System.out.println(sb);
            }else{
            	System.out.println(0);
            }
		}
	}
}