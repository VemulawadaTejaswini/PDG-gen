
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		double x=0,y=0,dir=0;
		while(!(line = br.readLine()).equals("0,0")){
			String[] s = line.split(",");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			x += a*Math.sin(dir*Math.PI/180);
			y += a*Math.cos(dir*Math.PI/180);
			dir += b;
		}
		System.out.println((int)x+"\n"+(int)y);
	}

}