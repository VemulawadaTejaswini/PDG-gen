import java.util.*;
import java.io.*;

public class Main {
	
	public  void solve() throws IOException{
		int[][] result = new int[4][2];
		while( stdIn.hasNext() ){
			double[] eye = new double[2];
			for(int i = 0; i < 2; i++){
				eye[i] = stdIn.nextDouble();
				if( eye[i] >= 1.1 ){
					result[0][i]++;
				} else if( eye[i] >= 0.6 ){
					result[1][i]++;
				} else if( eye[i] >= 0.2 ){
					result[2][i]++;
				} else {
					result[3][i]++;
				}
			}
		}
		for(int[] x : result){
			writer.println(x[0] + " " + x[1]);
		}	
		writer.flush();				
	}
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	Scanner stdIn;
	PrintWriter writer;
	
	public void run() throws IOException{
		stdIn = null;
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			writer = new PrintWriter(System.out);
			solve();
			stdIn.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}	
}