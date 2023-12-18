import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public double[] grade = new double[]{ 1.1, 0.6, 0.2 };
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] left = new int[]{ 0, 0, 0, 0 };
		int[] right = new int[]{ 0, 0, 0, 0 };
		
		String line;
		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			double l = Double.parseDouble(dst[0]);
			double r = Double.parseDouble(dst[1]);
			int lf = 0;
			int rf = 0;
			
			for(int i=0; i<3; i++){
				if(l >= grade[i] && lf==0){
					left[i]++;
					lf = 1;
				}
				
				if(r >= grade[i] && rf==0){
					right[i]++;
					rf = 1;
				}
			}
			
			if(lf == 0){
				left[3]++;
			}
			if(rf == 0){
				right[3]++;
			}
		}
		
		for(int n=0; n<4; n++){
			System.out.printf("%d %d\n", left[n], right[n]);
		}
	}
}