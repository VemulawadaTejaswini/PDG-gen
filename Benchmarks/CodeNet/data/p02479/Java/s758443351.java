import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		double r;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		r = Double.parseDouble(s);

		System.out.println(Math.PI*r*r+" "+2*Math.PI*r);
	}

}