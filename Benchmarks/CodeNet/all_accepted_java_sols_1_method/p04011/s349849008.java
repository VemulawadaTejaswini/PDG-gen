import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args)throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int N = Integer.parseInt(br.readLine());
	int K = Integer.parseInt(br.readLine());
	int X = Integer.parseInt(br.readLine());
	int Y = Integer.parseInt(br.readLine());
	if(N<=K){
		System.out.println(X*N);
	}
	else{
	System.out.println((X*K)+(N-K)*Y);
	}
	}

}
