import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a){

		String str;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(null != (str = bf.readLine())){
				String[] arr = str.split(" ");
				int number = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
				int count = 0;
				while(number == 0){
					number /= 10;
					count++;
				}
				System.out.println(count);
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