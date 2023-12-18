import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
		String s1 = input.substring(0,1);
		String s2 = input.substring(1,2);
		String s3 = input.substring(2,3);
		int day = 0;
		
		if(s1.equals("R")) {
			day = 1;
			if(s2.equals("R")) {
				day = 2;
				if(s3.equals("R")) {
					day = 3;
				}	
			}
		}
		else if(s2.equals("R")) {
			day = 1;
			if(s3.equals("R")) {
				day = 2;
			}	
		}
		else if(s3.equals("R")) {
			day = 1;
		}

		System.out.println(day);

	}

}