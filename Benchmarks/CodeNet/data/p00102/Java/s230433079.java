import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<int[][]> ans = new ArrayList<int[][]>();
		String line;
		while((line = in.readLine()) != null){
			int n = Integer.parseInt(line);

			if(n == 0) break;

			int[][] data = new int[n+1][n+1];

			for(int i=0; i<n; i++){
				line = in.readLine();
				String[] dst = line.split(" ");

				int sum = 0;
				for(int j=0; j<n; j++){
					data[j][i] = Integer.parseInt(dst[j]);
					sum += data[j][i];
				}
				data[n][i] = sum;
			}

			for(int j=0; j<=n; j++){
				int sum = 0;
				for(int i=0; i<n; i++){
					sum += data[j][i];
				}
				data[j][n] = sum;
			}

			ans.add(data);
		}

		for(int m=0; m<ans.size(); m++){
			int[][] dst = ans.get(m);

			for(int i=0; i<dst.length; i++){
				for(int j=0; j<dst.length; j++){
					System.out.printf("%5d", dst[j][i]);
					if(j != dst.length-1){
						System.out.print(" ");
					}
				}
				if(i != dst.length-1){
					System.out.println();
				}
			}
		}
	}
}