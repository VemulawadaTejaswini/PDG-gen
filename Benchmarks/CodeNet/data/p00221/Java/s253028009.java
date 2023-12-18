import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			String[] sss=br.readLine().split(" ");
			int m = Integer.parseInt(sss[0]);
			int n = Integer.parseInt(sss[1]);
			if(n+m==0)break;
			boolean[] mem=new boolean[m];
			Arrays.fill(mem,true);
			int idx=-1;
			for(int i = 0;i<n;i++){
				for(int j = 0;j<m;j++){
					idx++;
					idx=idx%mem.length;
					if(mem[idx]){
						break;
					}
				}
				int r=right(i+1);
				String s =br.readLine();
				int g=0;
				if(s.equals("")){
					g=0;
					if(r!=g){
						mem[idx]=false;
					}
					continue;
				}
				try{
					g=Integer.parseInt(s);
				}
				catch(NumberFormatException e){
					if(s.equals("Fizz")){
						g=-1;
					}
					else if(s.equals("Buzz")){
						g=-2;
					}
					else if(s.equals("FizzBuzz")){
						g=-3;
					}
					else{
						g=0;
					}
				}

				//System.out.println(r+" "+cnt);
				if(r!=g){
					mem[idx]=false;
				}
			}
			boolean first=true;
			for(int i = 0;i<mem.length;i++){
				if(mem[i]){
					if(first){
						System.out.print(i+1);
						first=false;
					}
					else{
						System.out.print(" "+(i+1));
					}
				}
			}
			System.out.println();
			
		}
		
	}
	static int right(int a){
		if(a%15==0)
			return -3;
		else if(a%5==0){
			return -2;
		}
		else if(a%3==0){
			return -1;
		}
		return a;
	}
}