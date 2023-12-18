import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String line = br.readLine();
    	while(line!=null){
    		String[] lines = line.split(" ");
    		double a = Double.parseDouble(lines[0]);
    		double b = Double.parseDouble(lines[1]);
    		double c = Double.parseDouble(lines[2]);
    		double d = Double.parseDouble(lines[3]);
    		double e = Double.parseDouble(lines[4]);
    		double f = Double.parseDouble(lines[5]);
    		
    		double x = (c*e-f*b)/(a*e - d*b);
    		double y = (c-a*x)/b;
    		System.out.print(x);
    		System.out.print(" ");
    		System.out.println(y);
    		line = br.readLine();
    	}
	}
}