import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<String> Ans = new ArrayList<String>();
		String line = in.readLine();
		
		int size = Integer.parseInt(line);
		for(int n=0; n<size; n++){
			line = in.readLine();
			int num = 0;
			List<String> train = new ArrayList<String>();
			train.add(line.substring(0, 1));
			for(int i=1; i<line.length(); i+=3){
				String arrow = line.substring(i, i+2);
				String tr = line.substring(i+2, i+3);
				if(arrow.equals("->")){
					if(num == train.size()-1){
						train.add(tr);
						num += 1;
					}
					else{
						num += 1;
					}
				}
				if(arrow.equals("<-")){
					if(num == 0){
						train.add(0, tr);
					}
					else{
						num -= 1;
					}
				}
			}
			
			String str = "";
			for(int m=0; m<train.size(); m++){
				str += train.get(m);
			}
			
			Ans.add(str);
		}
		
		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}
}