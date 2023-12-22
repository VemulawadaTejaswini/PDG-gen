import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int x, y, z;
        int ans = 0;
        try{
        	String[] list = br.readLine().split(" ");
        	x = Integer.parseInt(list[0]);
        	y = Integer.parseInt(list[1]);
        	z = Integer.parseInt(list[2]);
        	
        	for (int i = x; i <= y; i++)
        	{
        		if (z % i == 0)
        			ans += 1;
        	}
        	
        }
        catch(IOException e){
        	e.printStackTrace();
        }
        System.out.println(ans);
	}

}