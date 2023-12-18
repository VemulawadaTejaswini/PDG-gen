import java.util.*;
import java.io.*;

public class Main {
	
	public void sort(int[] x, double[] y){
		for(int i = 0; i < x.length; i++){
			int min = i;
			for(int j = i; j < x.length; j++){
				if( y[j] < y[min] ){
					min = j;
				}
			}
			int temp1 = x[min];
			double temp2 = y[min];
			x[min] = x[i];
			y[min] = y[i];
			x[i] = temp1;
			y[i] = temp2;
		}
	}
	public void solve() throws IOException{
		int[] spare = new int[6];
		double[] spare_time = new double[6];
		for(int i = 0; i < 3; i++){
			int[] n = new int[8];
			double[] time = new double[8];
			for(int j = 0; j < 8; j++){
				n[j] = nextInt();
				time[j] = nextDouble();
			}
			sort(n, time);
			writer.printf("%d %.2f\n", n[0], time[0]);
			writer.printf("%d %.2f\n", n[1], time[1]);
			spare[i*2] = n[2]; spare_time[i*2] = time[2];
			spare[i*2+1] = n[3]; spare_time[i*2+1] = time[3];			
		}
		sort(spare, spare_time);
		writer.printf("%d %.2f\n", spare[0], spare_time[0]);
		writer.printf("%d %.2f\n", spare[1], spare_time[1]);
		writer.flush();
	}			
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() throws IOException{
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}	
	public double nextDouble() throws IOException{
		return Double.parseDouble(nextToken());
	}
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}