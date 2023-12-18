import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;
		
		shop A = new shop(200, 380, 5, 0.20);
		shop B = new shop(300, 550, 4, 0.15);
		shop C = new shop(500, 850, 3, 0.12);
		
		while((line = in.readLine()) != null){
			int need = Integer.parseInt(line);
			
			if(need==0) break;
			
			int minCost = 1000000000;
			for(int a=0; a<=need/A.vol; a++){
				for(int b=0; b<=need/B.vol; b++){
					for(int c=0; c<=need/C.vol; c++){
						if(a*A.vol+b*B.vol+c*C.vol == need){
							int ap = A.getCost(a);
							int bp = B.getCost(b);
							int cp = C.getCost(c);
							int total = ap + bp + cp;
							if(total < minCost){
								minCost = total;
							}
						}
					}
				}
			}
			
			Ans.add(minCost);
		}
		
		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}
	
}

class shop{
	int vol;
	int price;
	int discount;
	double rate;
	
	public shop(int vol, int price, int discount, double rate){
		this.vol = vol;
		this.price = price;
		this.discount = discount;
		this.rate = rate;
	}
	
	public int getCost(int x){
		int cost = x * this.price;
		if(x >= this.discount){
			cost -= (int)(x/this.discount) * this.rate * this.price * this.discount;
		}
		
		return cost;
	}
}