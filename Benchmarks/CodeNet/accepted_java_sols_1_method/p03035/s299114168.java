import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int A = Integer.parseInt(tmp[0]);
		int B = Integer.parseInt(tmp[1]);

		if(A<=5){
			System.out.println(0);
		}else if(A<=12){
			System.out.println(B/2);
		}else{
			System.out.println(B);
		}
	}



}
