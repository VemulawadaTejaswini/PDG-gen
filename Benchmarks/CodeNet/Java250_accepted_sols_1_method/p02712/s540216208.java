import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long sum = 0;
		for(int i=1; i<N+1; i++) {
			if(i%3==0 && i%5==0)
				continue;
			if(i%3==0)
				continue;
			if(i%5==0)
				continue;
			
			sum += i;
		}
		
		System.out.println(sum);
	}

}