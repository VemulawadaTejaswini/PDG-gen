import java.util.*;
import java.io.*;

public class Main {

	public void sort(int[] r){
		boolean flag = false;
		for(int i = 0; i < r.length; i++){
			int key = i;
			for(int j = i; j < r.length; j++){
				if( flag ){
					if( r[j] > r[key] ){
						key = j;
					}
				} else {
					if( r[j] < r[key] ){
						key = j;
					}
				}
			}
			int temp = r[key];
			r[key] = r[i];
			r[i] = temp;
			flag = (flag) ? false : true;
		}
	}
	public double dist(int x, int y){
		return 2*Math.sqrt(x*y);
	}
	public void solve() throws IOException{
		while( stdIn.hasNext() ){
			String[] s = stdIn.nextLine().split(" ");
			int m = Integer.parseInt(s[0]);
			int[] r = new int[s.length-1];
			for(int i = 0; i < r.length; i++){
				r[i] = Integer.parseInt(s[i+1]);
			}
			sort(r);
			double sum = r[0] + r[r.length-1];
			for(int i = 0; i < r.length-1; i++){
				sum += dist(r[i], r[i+1]);
			}
		//	System.out.println(sum);
			if( sum > m ){
				System.out.println("NA");
			} else {
				System.out.println("OK");
			}
		}
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