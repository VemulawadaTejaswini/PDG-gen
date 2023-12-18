import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);

		int ABangle = Integer.parseInt(str[2]);
		double c = Math.sqrt((a * a) + (b * b));								//????????´???????????????:c^2 = a^2 + b^2
		double height = (int) ((int) a * Math.sin(ABangle)); 									//??????
		int CAangle = (int) Math.sin((-1)*(height/c));
		double s  = ((a + b + c)/2);
		double area = Math.sqrt(s*((s - a)*(s - b)*(s - c)));					//???????????¬???: ??¢??? = ???s(s - a)(s - b)(s - c)
		System.out.println(area);
		System.out.println((a + b + c));
		System.out.println(height);
	}
}