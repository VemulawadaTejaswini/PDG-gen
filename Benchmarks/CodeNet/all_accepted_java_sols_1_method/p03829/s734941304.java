import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] nab = str.split(" ");
		int n = Integer.parseInt(nab[0]);
		long a = Long.parseLong(nab[1]);
		long b = Long.parseLong(nab[2]);

		str = input.readLine();
		String[] strx = str.split(" ");
		long[] x = new long[n];
		for(int i=0; i<n; i++){
			x[i] = Long.parseLong(strx[i]);
		}

		long answer = 0;
		for(int i=0; i<n-1; i++){
			if((x[i+1]-x[i])*a > b){
				answer = answer + b;
			}else{
				answer = answer + (x[i+1]-x[i])*a;
			}
		}
		System.out.println(answer);

	}

}
