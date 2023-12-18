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
				Boolean[][] left = new Boolean[n][n];
				Boolean[][] right = new Boolean[n][n];
				
				//create matrix
				for(int row=0;row<n;row++){
					line=r.readLine();
					String[] temp = line.split(" ");
					for(int column=0;column<n;column++){
						int t = Integer.parseInt(temp[column]);
						m[row][column] = t;
					}
				}

				//look for the shortest index for each row
				for(int row=0;row<n;row++){
					int shortest = m[row][0];
					for(int column=1;column<n;column++){
						if(m[row][column]<shortest){
							shortest=m[row][column];
						}
					}
					for(int column=0;column<n;column++){
						if(m[row][column]==shortest){
							left[row][column]=true;
						}
					}
				}
				//look for the tallest student in each column
				for(int column=0;column<n;column++){
					int tallest = m[0][column];
					for(int row=1;row<n;row++){
						if(m[row][column]>tallest){
							tallest=m[row][column];
						}
					}
					for(int row=0;row<n;row++){
						if(m[row][column]==tallest){
							right[row][column]=true;
						}
					}
				}
				
				int res = 0;
				
				for(int row=0;row<n;row++){
					for(int column=0;column<n;column++){
						if(left[row][column]&&right[row][column]){
							res = m[row][column];
							break;
						}
					}
					if(res!=0){
						break;
					}
				}
				System.out.println(res);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}