import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String r=br.readLine();
		int i=Integer.parseInt(r);
		double s=i*i*Math.PI;
		double l=Math.PI*2*i;
		System.out.printf("%f %f",s,l);
	
	}
	}