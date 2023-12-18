import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String uketori=br.readLine();
		int sum=Integer.parseInt(uketori);
		long kazu = 0;
		if(sum>18 && sum<=36){
			int aki=36-sum;
			kazu=(aki+3)*(aki+2)*(aki+1)/(1*2*3);
		}
		else if(sum>-1 && sum<=18){
			int aki=sum;
			kazu=(aki+3)*(aki+2)*(aki+1)/(1*2*3);
		}
		else{
			kazu=0;
		}

		System.out.println(kazu);
	}
}