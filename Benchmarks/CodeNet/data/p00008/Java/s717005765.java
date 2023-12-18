
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input=br.readLine();
		String[] uketori = input.split(" ");
		int kai=uketori.length;
		int[] sum=new int[kai];
		for(int i=0; i<kai-1; i++){
			sum[i]=Integer.parseInt(uketori[i]);
			
			long kazu = 0;
			if(sum[i]>=27 && sum[i]<=36){
				int aki=36-sum[i];
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
			}
			else if(sum[i]>=10 && sum[i]<=18){
				int aki=sum[i];
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
				int gen=((sum[i]-9+2)*(sum[i]-9+1))/2;
				kazu-=gen*4;

			}
			else if(sum[i]>=19 && sum[i]<=26){
				int aki=36-sum[i];
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
				int gen=((27-sum[i]+2)*(27-sum[i]+1))/2;
				kazu-=gen*4;
			}
			else if(sum[i]>=0 && sum[i]<=9){
				int aki=sum[i];
				kazu=((aki+3)*(aki+2)*(aki+1))/6;
			}
			else{
				kazu=0;
			}
			System.out.println(kazu);
		}
	}
}