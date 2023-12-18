import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ");
		int W = Integer.parseInt(num[0]);
		int H = Integer.parseInt(num[1]);
		int x = Integer.parseInt(num[2]);
		int y = Integer.parseInt(num[3]);
		int r = Integer.parseInt(num[4]);

		if(W*H > (r*2)*(x*y)){
		 System.out.println("Yes");
		}else{
		 System.out.println("No");

		}

	}

}