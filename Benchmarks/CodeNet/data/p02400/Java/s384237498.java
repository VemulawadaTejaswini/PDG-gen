import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r=Integer.parseInt(br.readLine());
		double Men,Syu;
		Men=(double)r*r*Math.PI;
		Syu=(double)2*r*Math.PI;
		System.out.println(Men+" "+Syu);
	}
}