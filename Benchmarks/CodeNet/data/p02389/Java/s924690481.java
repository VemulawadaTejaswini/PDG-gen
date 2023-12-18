import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main() throws Exception{	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,area,line;

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());

		area = a * b;
		line = a * 2 + b * 2;

		System.out.println(area + " " + line);

		br.close();

	}
}