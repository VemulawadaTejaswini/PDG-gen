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

	public int[] gen = new int[]{ 10, 20, 30, 40, 50, 60 };
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;
		
		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			if(size == 0) break;
			int[] dis = new int[]{ 0, 0, 0, 0, 0, 0, 0 };
			
			for(int i=0; i<size; i++){
				line = in.readLine();
				int age = Integer.parseInt(line);
				int over60 = 0;
				for(int j=0; j<6; j++){
					if(age < gen[j]){
						dis[j]++;
						over60 = 1;
						break;
					}
				}
				
				if(over60 == 0){
					dis[6]++;
				}
			}
			
			for(int i=0; i<7; i++){
				Ans.add(dis[i]);
			}
		}
		
		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}
}