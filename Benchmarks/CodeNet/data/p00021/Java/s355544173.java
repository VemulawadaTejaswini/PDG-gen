import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static Main byakko = new Main();
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException{
		
		int n = byakko.Input();
		
		for(int i = 0; i < n; i++){
			String[] code = reader.readLine().split(" ");
			double x  = Double.parseDouble(code[0]);
			double y  = Double.parseDouble(code[1]);
			double x1 = Double.parseDouble(code[2]);
			double y1 = Double.parseDouble(code[3]);
			double x2 = Double.parseDouble(code[4]);
			double y2 = Double.parseDouble(code[5]);
			double x3 = Double.parseDouble(code[6]);
			double y3 = Double.parseDouble(code[7]);
			
			double dx = (y1 - y) / (x1 - x);
			double dy = (y3 - y2) / (x3 - x2);
			
			if(dx == dy)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		reader.close();
	}
	
	public int Input()throws IOException{
		return Integer.parseInt(reader.readLine());
	}

}