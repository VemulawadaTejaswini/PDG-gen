import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = reader.readLine();
			String[] sarray = line.split(" ", -1);
			int m = Integer.parseInt(sarray[0]);
			int f = Integer.parseInt(sarray[1]);
			int r = Integer.parseInt(sarray[2]);
			int x = (m + f);
			if(x => 80){
			System.out.println("A");
			}
			if(x => 65 && x < 80){
				System.out.println("B");
			}
			if(x => 50 && x < 65){
				System.out.println("C");
			}
			if(x => 30 && x < 50){
				System.out.println("D");
			}
			if(x => 30 && x < 50 && r => 50){
				System.out.println("C");
			}
			if(x => 0 && x < 30){
				System.out.println("F");
			}
			if(m == 0 && f == 0 && r == 0){
				break;
			}
		}
		/*
		int n = Integer.parseInt(sarray[0]);
		int m = Integer.parseInt(sarray[1]);
		int matrix[][] = new int[n][m];
		for(int i = 0; i < n; i++){
			String str = reader.readLine();
			String[] mat = str.split(" ", -1);
			for(int j = 0; j < m; j++){
				matrix[i][j] = Integer.parseInt(mat[j]);
			}
		}
		int vector[] = new int[m];
		for(int k = 0; k < m; k++){
			String vec = reader.readLine();
			vector[k] = Integer.parseInt(vec); //j<m k<m
		}
		int result[] = new int[n];
		for(int p = 0; p < n; p++){
			for(int q = 0; q < m; q++){
				result[p] += matrix[p][q]*vector[q];
			}
			System.out.println(result[p]);
		}
		*/
	}
}