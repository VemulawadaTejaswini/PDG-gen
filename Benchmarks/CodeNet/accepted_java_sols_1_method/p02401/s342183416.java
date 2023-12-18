import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int y , x;
        while (true)
        {
        String z;
        	String[] list = br.readLine().split(" ");
        	x = Integer.parseInt(list[0]);
        	y = Integer.parseInt(list[2]);
        	z = list[1];
        	
        	if (z.equals("?"))
        		break;
        	else if (z.equals("+"))
        		System.out.println(x + y);
        	else if (z.equals("-"))
        		System.out.println(x - y);
        	else if (z.equals("*"))
        		System.out.println(x * y);
        	else if (z.equals("/"))
        		System.out.println(x / y);
        		
        }	
	}

}