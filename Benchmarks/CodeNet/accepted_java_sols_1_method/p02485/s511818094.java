import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//String[] ia;
		//Scanner in = new Scanner(System.in);

		while(true){
			String number = in.readLine();
			if(number.equals("0")){
				break;
			}
			int ans = 0;
			for(int i = 0;i < number.length(); ++i){
				ans += (number.charAt(i) - '0');
			}
			System.out.println(ans);
		}
	}
}