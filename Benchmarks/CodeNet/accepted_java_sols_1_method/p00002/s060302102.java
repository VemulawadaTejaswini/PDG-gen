import java.util.*;
import java.io.*;
import java.math.*;

class Main {

    public static void main (String args[]) {
        
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				double sum = (double)(a+b);
				double digit = Math.floor(Math.abs(Math.log10(sum))) + 1;
				System.out.println((int)digit);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		finally {
			System.exit(0);
		}
	}
}