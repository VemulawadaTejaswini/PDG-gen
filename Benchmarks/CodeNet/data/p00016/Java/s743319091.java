import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static Main byakko = new Main();
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException{
		
		double x = 0, y = 0,z = 0,w = 0,h = 0;
		String str;
		
		while(true){
			if((str = byakko.Input()).equals("0,0"))break;
			z = Double.parseDouble(str.split(",",0)[0]);
			w = Double.parseDouble(str.split(",",0)[1]);
			
			x += (z * Math.sin(Math.toRadians(h)));
			y += (z * Math.cos(Math.toRadians(h)));
			h += w;
		}
		System.out.println((int)x);
		System.out.println((int)y);
		
		reader.close();
	}
	
	public String Input()throws IOException{
		return reader.readLine();
	}
	
}