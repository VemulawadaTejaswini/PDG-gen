import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;

		try {
			while(null != (tmpString = bf.readLine())){
				int d = Integer.parseInt(tmpString);
				int ans = 0;
				for(int i = d; i < 600; i += d){
					ans += Math.pow(i, 2) * d;
				}
				System.out.println(ans);
			}
		} catch (IOException e) {
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}

	}

}