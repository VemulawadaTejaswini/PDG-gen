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
		List<Runner> Ans = new ArrayList<Runner>();
		String line;
		
		List<Runner> third = new ArrayList<Runner>();
		for(int n=0; n<3; n++){
			double[] times = new double[8];
			Runner[] runner = new Runner[8];
			for(int m=0; m<8; m++){
				line = in.readLine();
				String dst[] = line.split(" ");
				int id = Integer.parseInt(dst[0]);
				double time = Double.parseDouble(dst[1]);
				times[m] = time;
				runner[m] = new Runner(id, time);				
			}
			
			Arrays.sort(times);
			int a=0, b=0, c=0, d=0;
			for(int m=0; m<8; m++){
				if(runner[m].time == times[0]){
					a = m;
				}
				if(runner[m].time == times[1]){
					b = m;
				}
				if(runner[m].time == times[2]){
					c = m;
				}
				if(runner[m].time == times[3]){
					d = m;
				}
			}
			
			Ans.add(runner[a]);
			Ans.add(runner[b]);
			
			if(n==0){
				third.add(runner[c]);
				third.add(runner[d]);
			}
			else{
				if(runner[c].time < third.get(0).time){
					third.add(0, runner[c]);
					third.remove(2);
				}
				else if(runner[c].time < third.get(1).time){
					third.add(1, runner[c]);
					third.remove(2);
				}
				
				if(runner[d].time < third.get(0).time){
					third.add(0, runner[d]);
					third.remove(2);
				}
				else if(runner[d].time < third.get(1).time){
					third.add(1, runner[d]);
					third.remove(2);
				}
			}
		}
		
		Ans.add(third.get(0));
		Ans.add(third.get(1));
		
		for(int n=0; n<Ans.size(); n++){
			Runner r = Ans.get(n);
			System.out.printf("%d %2.2f\n", r.id, r.time);
		}
	}
}

class Runner{
	int id;
	double time;
	
	public Runner(int id, double time){
		this.id = id;
		this.time = time;
	}
}