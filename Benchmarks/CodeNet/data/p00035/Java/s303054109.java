import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String string;
		
		while((string = reader.readLine()) != null){
			String[] source = string.split(",");
			double[] p = app.map(source);
			
			double tc = (p[0] - p[2]) * (p[5] - p[1]) + (p[1] - p[3]) * (p[0] - p[4]);
			double td = (p[0] - p[2]) * (p[7] - p[1]) + (p[1] - p[3]) * (p[0] - p[6]);
			
			if(tc * td == 1.0) System.out.println("YES");
			else               System.out.println("NO");
		}
		
		reader.close();
	}
	
	public double[] map(String[] source){
		double[] hoge = new double[8];
		for(int i = 0; i < 8; i++) hoge[i] = Double.parseDouble(source[i]);
		return hoge;
	}
	
}