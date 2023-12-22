import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while (true)
        {
        	String[] list = br.readLine().split(" ");
        	int x = Integer.parseInt(list[1]);
            int y = Integer.parseInt(list[0]);
            if (x == 0 && y == 0)
            	break;
            for (int i = 0; i < y; i++)
            {
            	for (int j = 0; j < x; j++)
            	{
            		if (i == 0 || i == y - 1 || j == 0 || j == x - 1)
            			System.out.print("#");
            		else
            			System.out.print(".");
            	}
            	System.out.println("");
            }
            System.out.println("");
        }
        
	}

}