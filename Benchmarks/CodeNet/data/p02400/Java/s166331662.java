import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String r=br.readLine();
		int i=Integer.parseInt(r);
		double s=0.5*Math.pow(i,2)*Math.PI;
		double l=Math.PI*2*i;
		System.out.printf("%5f %5f",s,l);
	
	}
	}