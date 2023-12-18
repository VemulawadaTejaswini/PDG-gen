import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true){
			String uketori=br.readLine();
			int sum=Integer.parseInt(uketori);
			long kazu = 0;
			if(sum>=27 && sum<=36){
				int aki=36-sum;
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
			}
			else if(sum>=10 && sum<=18){
				int aki=sum;
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
				int gen=0;
				for(int a=sum-9; a>=0; a--){
					gen+=(a+1)*a*2;
				}
				kazu=kazu-gen;

			}
			else if(sum>=19 && sum<=26){
				int aki=36-sum;
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
				int gen=0;
				for(int a=aki-9; a>=0; a--){
					gen+=(a+1)*a*2;
				}
				kazu=kazu-gen;
			}
			else if(sum>=0 && sum<=9){
				int aki=sum;
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
			}
			
			else{
				kazu=0;
			}
			System.out.println(kazu);
		}
	}
}