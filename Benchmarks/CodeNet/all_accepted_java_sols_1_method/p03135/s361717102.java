import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
            String inputStr = br.readLine();
			String[] inputNumbers = inputStr.split(" ");
            double T = Double.parseDouble(inputNumbers[0]);
        	double X = Double.parseDouble(inputNumbers[1]);
        	if (1<=T && T<=100 && 1<=X && X<= 100) {
            	double result = T/X;
            	System.out.println(result);
        	} else {
            	System.exit(1);
        	}
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}