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
				double time = number / 9.8;
				double height = (4.9 * Math.pow(time, 2));
				if(height != 0){
					System.out.println(Math.ceil(height / 5) + 1);
				} else {
					System.out.println("0");
				}
			}
		} catch (IOException e) {
		}
	}
}