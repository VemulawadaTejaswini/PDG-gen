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
		List<Integer> ans = new ArrayList<Integer>();
		String line;
		
		while((line = in.readLine()) != null){
			int num = Integer.parseInt(line);
			if(num == -1) break;
			
			int m = num;
			while(m != 0){
				ans.add(m%4);
				m >>= 2;
			}
			
			if(ans.size() != 0){
				for(int i=ans.size()-1; i>=0; i--){
					System.out.print(ans.get(i));
				}
				System.out.println();
			}else{
				System.out.println("0");
			}	
			ans.clear();
		}
	}
}