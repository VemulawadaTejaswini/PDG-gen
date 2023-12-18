import java.util.*;
import java.io.*;

public class Main {
	
	public void sort(int[][] data){
		for(int i = 0; i < data.length; i++){
			int min = i;
			for(int j = i+1; j < data.length; j++){
				if( data[min][2] > data[j][2] ){
					min = j;
				} else if( data[min][2] == data[j][2] ){
					if( data[min][1] > data[j][1] ){
						min = j;
					}
				}
			}
			for(int j = 0; j < 3; j++){
				int temp = data[min][j];
				data[min][j] = data[i][j];
				data[i][j] = temp;
			}
		}
	}
	public int[] nextPermutation(int[] x, int index){
		int max = index;
		boolean[] temp = new boolean[x.length];
		for(int i = index; i < x.length; i++){
			temp[x[i]-1] = true;
			if( x[i] > x[max] ){
				max = i;
			}
		}
		int key = index+1;
		if( max == index ){
			for(; index > 0; index--){
				temp[x[index-1]-1] = true;
				if( x[index] > x[index-1] ){
					break;
				}
			}
			if( index == 0 ){
				x[0] = -1;
				return x;
			}
			key = index;
		} 

		for(int i = x[key-1]; i < temp.length; i++){
			if( temp[i] ){
				x[key-1] = i+1;
				temp[i] = false;
				break;
			}
		}		
		int count = 0;
		for(int i = 0; i < temp.length; i++){
			if( temp[i] ){
				x[key+count] = i+1;
				count++;
			}
		}			
		return x;
	}
			
	public  void solve() throws IOException{
		int n = nextInt();
		int[][] data = new int[n][3];		
		for(int i = 0; i < n; i++){
			data[i][0] = nextInt();
			data[i][1] = nextInt();
			data[i][2] = nextInt();			
		}
		sort(data);		
		int[] x = new int[n];
		for(int i = 0; i < x.length; i++){
			x[i] = i+1;
		}
		double min = 1000000001;
		int[] ans = new int[n];
		System.arraycopy(x, 0, ans, 0, n);
		while( x[0] > 0 ){
			int[] total = new int[n];
			for(int i = n-2; i >= 1; i--){
				total[i] = total[i+1]+Math.abs(data[x[i]-1][1]-data[x[i+1]-1][1]);
			}
			
			double sum = 0;
			double w = 20*data[x[0]-1][2];
			double v = 2000/(70+20*w);	
			int i = 1;		
			for(; i < x.length; i++){
				int len = Math.abs(data[x[i]-1][1]-data[x[i-1]-1][1]);
				sum += len/v;
				w += 20*data[x[i]-1][2];
				v = 2000/(70+20*w);
				if( sum + total[i]/v > min ){
					sum = min;
					break;
				}
				
			}
			if( sum < min ){
				System.arraycopy(x, 0, ans, 0, n);
				min = sum;
			}
			i = Math.min(i, n-1);
			x = nextPermutation(x, i);			
		}
		writer.print(data[ans[0]-1][0]);
		for(int i = 1; i < n; i++){
			writer.print(" " + data[ans[i]-1][0]);
		}
		writer.println();		
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
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}