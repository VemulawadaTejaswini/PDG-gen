import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = Integer.parseInt(br.readLine());
		int w = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int max = Integer.max(h, w);
		int result =0;
		if(n%max == 0) {
			result = n/max;
		}else {
			result  = n/max +1;
		}
		System.out.println(result);
	}

}
