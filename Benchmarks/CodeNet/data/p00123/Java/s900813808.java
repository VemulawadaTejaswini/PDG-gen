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
	
	public double[] c500 = {
			35.5, 37.5, 40.0, 43.0, 50.0, 55.0, 70.0
	};
	
	public double[] c1000 = {
			71.0, 77.0, 83.0, 89.0, 105.0, 116.0, 148.0
	};
	
	public String[] cname = {
			"AAA", "AA", "A", "B", "C", "D", "E", "NA"
	};
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;
		
		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			double t500 = Double.parseDouble(dst[0]);
			double t1000 = Double.parseDouble(dst[1]);
			
			int cls = 7;
			for(int i=0; i<7; i++){
				if(t500 < c500[i] && t1000 < c1000[i]){
					cls = i;
					break;
				}
			}
			Ans.add(cls);
		}
		
		for(int n=0; n<Ans.size(); n++){
			System.out.println(cname[Ans.get(n)]);
		}
	}
}