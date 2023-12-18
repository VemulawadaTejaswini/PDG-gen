import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while((line = r.readLine())!=null){
				int V = Integer.parseInt(line.split(" ")[0]), d = Integer.parseInt(line.split(" ")[1]);
				if(V==1){
					System.out.println(1);
					continue;
				}
				int[] fib = new int[V];
				
				//obtain fibonacci sequence
				fib[0] = 2;
				fib[1] = 3;
				
				for(int i=2;i<V;i++){
					fib[i] = fib[i-2] + fib[i-1];
				}
				
				//mod 1001
				for(int i=14;i<V;i++){
					fib[i] = fib[i] % 1001;
				}
				
				//sort
				Arrays.sort(fib);
				
				//count connected subsets
				int c = 1;
				for(int i=0;i<V-1;i++){
					if(fib[i+1] - fib[i] >= d){
						c++;
					}
				}
				//output
				System.out.println(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}