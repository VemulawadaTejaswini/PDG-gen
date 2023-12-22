import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        long y , x;
        long sum = 0;
        String input = br.readLine();
        x = Long.parseLong(input);
        String[] list = br.readLine().split(" ");
        long ma = Long.parseLong(list[0]);
        long mi = Long.parseLong(list[0]);
        for (int i = 0; i < x; i ++)
        {
        	y = Integer.parseInt(list[i]);
        	ma = Math.max(ma, y);
        	mi = Math.min(mi, y);
        	sum += y;
        }	
        System.out.println(mi +" " +  ma +" " + sum);
	}

}