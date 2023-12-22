import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        	String input = br.readLine();
        	String[] inputan = br.readLine().split(" ");
        	for (int j = Integer.parseInt(input) - 1; j >= 0; j--)
        	{
        		System.out.print(inputan[j]);
        		if (j > 0)
        			System.out.print(" ");
        		if (j == 0)
        			System.out.println();
        	}
        	
        	
	}

}