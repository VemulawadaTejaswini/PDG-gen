import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			int m = Integer.parseInt(br.readLine());
			int[][] matrix = new int[m][m];
			for(int i = 0; i < m; i++){
				Arrays.fill(matrix[i], -1);
			}
			
			for(int i = 0; i < m; i++){
				String[] tmpArray = br.readLine().split(",");
				int a = Integer.parseInt(tmpArray[0]);
				int b = Integer.parseInt(tmpArray[1]);
				int d = Integer.parseInt(tmpArray[2]) - 100;
				
				matrix[a][b] = d;
				matrix[b][a] = d;
			}
			
			int sum = MyPlim(matrix);
			System.out.println(sum/100);
		}
	}

	static int MyPlim(int[][] matrix){
        int result = 0;
        int n = matrix[0].length;
         
        int[] visited = new int[n];
        Arrays.fill(visited, 0);
         
        visited[0] = 1;
        int checked = 1;
         
        while(true){
            int min = Integer.MAX_VALUE;
            int minI = -1;
            int minJ = -1;
            for(int i = 0; i < n; i++){
                if(visited[i] == 0){
                    continue;
                }
                for(int j = 0; j < n; j++){
                    if(min > matrix[i][j] && matrix[i][j] >= 0 && visited[j] == 0){
                        min = matrix[i][j];
                        minI = i;
                        minJ = j;
                    }
                }
            }
             
            result += min;
//            System.out.println("("+minI+","+minJ+") added distance"+min);
            checked++;
            visited[minI] = 1;
            visited[minJ] = 1;
            matrix[minI][minJ] = -1;
            matrix[minJ][minI] = -1;
             
            if(checked == n){
                break;
            }
        }
         
        return result;
    }
}