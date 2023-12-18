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
	
	long[] m = new long[]{ 2, 7, 61 };
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;
		
		int[] prime = new int[1000000];
		for(int i=2; i<1000000; i++){
			if(isPrime(i)){
				prime[i] = 1;
			}
			else{
				prime[i] = 0;
			}
		}
		
		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);
			if(size==0) break;
			
			int pay = 0;
			for(int n=0; n<size; n++){
				line = in.readLine();
				String[] dst = line.split(" ");
				int center = Integer.parseInt(dst[0]);
				int range = Integer.parseInt(dst[1]);
				
				int count = 0;
				for(int i=Math.max(2, center-range); i<=Math.min(center+range, 999983); i++){
					if(prime[i]==1){
						count++;
					}
				}
				
				pay += count - 1;
			}
			
			Ans.add(Math.max(0, pay));
		}
		
		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}		
	}
	
	public boolean isPrime(long x){
		if(x==2){
			return true;
		}
		else if(x%2 == 0){
			return false;
		}
		else{
			long s = 0;
			long d = x - 1;
			while(d%2 == 0){
				d = d / 2;
				s++;
			}
			
			for(int i=0; i<3; i++){
				long a = m[i];
				if(a%x == 0) continue;
				if(mod(a, d, x) == 1) continue;
				
				boolean con2 = false;
				for(int r=0; r<=s-1; r++){
					if(mod(a, (long)(d * Math.pow(2.0, r)), x) ==  x - 1){
						con2 = true;
						break;
					}
				}
				
				if(!con2){
					return false;
				}
			}
			
			return true;
		}
	}
	
	public long mod(long a, long d, long n){
		if(a==0 || n==0) return 0;
		if(d==0) return 1 % n;
		
		long currentMod = a % n;
		long currentValue = (d%2 == 1) ? currentMod : 1;
		
		for(d>>=1; d>0; d>>=1){
			currentMod = (currentMod * currentMod) % n;
			if(d%2 == 1){
				currentValue = (currentValue * currentMod) % n;
			}
		}
		
		return currentValue;
		
	}
}