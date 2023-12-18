import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != ( str = bf.readLine() )){
				String[] arr = str.split(" ");
				long num1 = Long.parseLong(arr[0]);
				long num2 = Long.parseLong(arr[1]);
				long min_num = num1>num2 ? euclidean( num1, num2) : euclidean(num2, num1);
				long max_num = ( num1 / min_num ) * ( num2 / min_num ) * min_num;
				System.out.println(min_num + " " + max_num);
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

	private static long euclidean(long num1, long num2){
		if(num2 == 0){
			return num1;
		}
		long tmp_num = num1 % num2;
		return euclidean(num2, tmp_num);
	}
}