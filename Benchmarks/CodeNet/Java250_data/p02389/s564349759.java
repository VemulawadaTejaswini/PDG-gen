import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strArray = str.split(" ",0);
		int num[] = new int[strArray.length];

		for(int i=0; i<strArray.length; i++){
			num[i] = Integer.parseInt(strArray[i]);
		}

		int ans1 = num[0] * num[1];
		int ans2 = 2*(num[0] + num[1]);

		System.out.println(ans1 + " " + ans2);

	}

}