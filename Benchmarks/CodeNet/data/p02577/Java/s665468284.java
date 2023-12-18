import java.io.*;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		
		try(InputStreamReader is = new InputStreamReader(System.in);) {
			int input = is.read();
			while(input != -1) {
				sum += input;
				input = is.read();
			}
		} catch (Exception e) {
			;
		}
		if(sum%9 == 0) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	
	}

}