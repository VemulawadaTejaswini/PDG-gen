import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r=Double.parseDouble(br.readLine());
		double Men,Syu;
		Men=r*r*Math.PI;
		Syu=2*r*Math.PI;
		System.out.printf("%.6f %.6f",Men,Syu);
	}
}