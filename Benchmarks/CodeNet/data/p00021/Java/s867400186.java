import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		double x1,y1,x2,y2,x3,y3,x4,y4,dx,dy;
		
		for(int i = 0; i < n; i++){
			String[] code = reader.readLine().split(" ");
			x1 = Double.parseDouble(code[0]);
			y1 = Double.parseDouble(code[1]);
			x2 = Double.parseDouble(code[2]);
			y2 = Double.parseDouble(code[3]);
			x3 = Double.parseDouble(code[4]);
			y3 = Double.parseDouble(code[5]);
			x4 = Double.parseDouble(code[6]);
			y4 = Double.parseDouble(code[7]);
			
			dx = (y2 - y1) / (x2 - x1);
			dy = (y4 - y3) / (x4 - x3);
			
			if(dx == dy)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		reader.close();
	}
}