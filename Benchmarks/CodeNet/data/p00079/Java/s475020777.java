//Area of Polygon
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a,b,c,x1,x2,x3,y1,y2,y3,z,S=0;
		
		//???????????????????????±?????????
		String[] str1 = br.readLine().split(",");
		x1 = Double.parseDouble(str1[0]);
		y1 = Double.parseDouble(str1[1]);
		String[] str2 = br.readLine().split(",");
		x2 = Double.parseDouble(str2[0]);
		y2 = Double.parseDouble(str2[1]);
		String str = br.readLine();
		
		while(str != null){
			String[] str3 = str.split(",");
			x3 = Double.parseDouble(str3[0]);
			y3 = Double.parseDouble(str3[1]);
			a = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
			b = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
			c = Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
			z = (a+b+c)/2;
			S += Math.sqrt(z*(z-a)*(z-b)*(z-c));
			str = br.readLine();
			x2 = x3;
			y2 = y3;
		}
		System.out.println(S);
		
		br.close();
	}
}