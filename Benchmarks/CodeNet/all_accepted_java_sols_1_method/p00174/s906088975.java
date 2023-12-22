import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while((line = in.readLine()) != null){
			if(line.equals("0")) break;

			int l = line.length();
			int[] game = new int[l];
			for(int i=0; i<l; i++){
				game[i] = (line.substring(i, i+1).equals("A")) ? 0 : 1;
			}
			
			int[] point = new int[]{ 0, 0 };
			int server = game[0];
			for(int i=1; i<l; i++){
				point[game[i]]++;
				if(server != game[i]){
					server = game[i];
				}
			}
			
			if(point[0] > point[1]){
				point[0]++;
			}
			else{
				point[1]++;
			}
			
			System.out.printf("%d %d\n", point[0], point[1]);
		}
	}
}