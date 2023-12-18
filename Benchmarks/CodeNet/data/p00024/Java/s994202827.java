import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString = null;

		try {
			while(null != (tmpString = bf.readLine())){
				double number = Double.parseDouble(tmpString);
				double height = (4.9 * Math.pow(number / 9.8, 2));
				if(height % 5 == 0){
					System.out.println(height / 5 + 2);
				} else {
					System.out.println(Math.ceil(height / 5) + 1);
				}
			}
		} catch (IOException e) {
		}
	}
}