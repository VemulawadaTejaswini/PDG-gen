import java.io.*;

class Main {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] line = br.readLine().split(" ");
			int a1 = Integer.parseInt(line[0]);
			int a2 = Integer.parseInt(line[1]);
			int[][] n = new int [a1][a2];
			int[] b = new int[a2];

			
			for(int i = 0;i < a1;i++){
				String[] str = br.readLine().split(" ");
				for(int j = 0;j < a2;j++){
					int f = Integer.parseInt(str[j]);
					n[i][j] += f;
				}
			}
			
			for(int i = 0;i < a2;i++){
				int f = Integer.parseInt(br.readLine());
				b[i] += f;
			}
			
			for(int i = 0;i < a1;i++){
				int matrix = 0;
				for(int j = 0;j < a2;j++){
				matrix += n[i][j]*b[j];
				}
			System.out.println(matrix);	
			}
		} catch(Exception e){
		}
	}
}
				 
			