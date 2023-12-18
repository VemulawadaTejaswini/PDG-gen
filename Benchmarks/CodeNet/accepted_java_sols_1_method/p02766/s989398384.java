
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] as = br.readLine().split(" ");
		int n = Integer.parseInt(as[0]);
		int k = Integer.parseInt(as[1]);
		int res = 0;
		while(true) {
			res++;
			if(Math.pow(k, res) > n) {
				break;
			}
		}
		System.out.println(res);
	
	}

}
