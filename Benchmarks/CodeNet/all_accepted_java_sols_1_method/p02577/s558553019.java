import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int MAX = str.length();
		int sum = 0;
		for(int i = 0; i < MAX; i++) {
			int s = Integer.parseInt(str.substring(i,i+1));
			sum = sum + s;
		}

		if(sum%9==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
      
	}
}
