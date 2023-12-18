import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while((line = r.readLine())!=null){
				if(line.length()<1) break;
				int N = Integer.parseInt(line);
				String[] pline = r.readLine().split(" ");
				int[] p = new int[N];
				for(int i=0;i<N;i++){
					p[i] = Integer.parseInt(pline[i]);
				}
				
				Arrays.sort(p);
				
				int time = 0;
				
				for(int i=0;i<N;i++){
					time += p[i]*(N-i);
				}
				
				System.out.println(time);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}