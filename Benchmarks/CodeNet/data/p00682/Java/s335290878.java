import java.util.Scanner;


public class Main {
	
	static boolean t = true;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			count++;
			
			int[][] vertexs = new int[n][2];
			
			for(int i = 0; i < n; i++){
				vertexs[i][0] = sc.nextInt();
				vertexs[i][1] = sc.nextInt();
			}
			
			double sum = 0;
			
			for(int i = 0; i < n-1; i++){
				sum += (vertexs[i][0]*vertexs[i+1][1] - vertexs[i][1]*vertexs[i+1][0])/2.0;
			}
			sum += (vertexs[n-1][0]*vertexs[0][1] - vertexs[n-1][1]*vertexs[0][0])/2.0;
			
			System.out.println(count + " " + (-sum));
			
		}
	}
	
	
}