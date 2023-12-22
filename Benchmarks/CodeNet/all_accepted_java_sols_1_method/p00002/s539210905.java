import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
    	while(line!=null){
    		String[] lines = line.split(" ");
    		int a = Integer.parseInt(lines[0]);
    		int b = Integer.parseInt(lines[1]);
    		System.out.println(Integer.toString(a+b).length());
    		line = br.readLine();
    	}
	}
}