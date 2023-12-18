import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != ( str = bf.readLine() )){
				long n = Long.parseLong(str);
				long ans = 100;
				while(n-- > 0){
					ans = (long) Math.ceil(ans * 1.05);
				}
				System.out.println(ans * 1000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}
	}

}