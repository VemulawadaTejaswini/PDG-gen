import java.io.*;
//import java.math.BigDecimal;
//import java.lang.reflect.Array;
//import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
//			do {
//				String[] in = line.split(" ", 0);
//				//???????????????????¨????
//				
//				//???????????§??????
//				line = br.readLine();
//			} while (line != null);
			int num = line.length();
			String x = "";
			for(int i = 0; i < num; i++){
				x += line.charAt(num - i - 1);
			}
			System.out.println(x.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.exit(0);
		}

	}

}