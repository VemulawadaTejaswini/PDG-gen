import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int n = Integer.parseInt(str);
		int m = 100000;
		int f = 100000;

		for(int i=0; i<n; i++){
			m += (f/20);
		}

		if(m%10000 != 0){
			m += 5000;
		}

		System.out.println(m);

	}
}