import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int a, b, C;
		double S, L, h, c, R;//S:??¢??????L:??¨????????????h:a???????????¨????????¨????????????
		String str;
		String[] array_str;

		try{
			str=reader.readLine();
			array_str=str.split(" ");
			a=Integer.parseInt(array_str[0]);
			b=Integer.parseInt(array_str[1]);
			C=Integer.parseInt(array_str[2]);

			S=Math.sin(Math.toRadians(C))*a*b/2;
			c=Math.sqrt(b*b+a*a-2*a*b*Math.cos(Math.toRadians(C)));
			R=c/Math.sin(Math.toRadians(C));
			L=a+b+c;
			h=b*Math.sin(Math.toRadians(C));

			System.out.printf("%.8f", S);
            System.out.println();
            System.out.printf("%.8f", L);
            System.out.println();
            System.out.printf("%.8f", h);
            System.out.println();

		}catch(IOException e){
			System.out.print(e);
		}
	}

}