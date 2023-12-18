import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != ( str = bf.readLine() )){
				int n = Integer.parseInt(str);
				if(n > 36){
					System.out.println(0);
				} else if(n == 0 || n == 36){
					System.out.println(1);
				} else if(n < 18){
					System.out.println( n * 4 );
				} else {
					System.out.println( (36 - n) * 4 );
				}
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