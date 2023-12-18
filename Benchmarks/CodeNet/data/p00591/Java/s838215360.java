import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			int n;
			
			while(true){
				line=r.readLine();
				n = Integer.parseInt(line);
				if(n==0){
					break;
				}
				
				int[][] m = new int[n][n];
				int[] shortindex = new int[n];//index of the shortest student in each row 
				Boolean nosol = true;
				
				//create matrix
				for(int row=0;row<n;row++){
					line=r.readLine();
					String[] temp = line.split(" ");
					int min = Integer.MAX_VALUE;
					for(int column=0;column<n;column++){
						int t = Integer.parseInt(temp[column]);
						m[row][column] = t;
						//record shortest index for each row
						if(t<min){
							min = t;
							shortindex[row] = column;
						}
					}
				}
				
				//look for the tallest student in each column
				for(int column=0;column<n;column++){
					int max = Integer.MIN_VALUE,tallindex=0;
					for(int row=0;row<n;row++){
						if(m[row][column]>max){
							max = m[row][column];
							tallindex = row;
						}
					}
					
					if(column == shortindex[tallindex]){
						System.out.println(m[tallindex][column]);
						nosol = false;
						break;
					}
				}
				
				if(nosol){
					System.out.println("0");		
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}