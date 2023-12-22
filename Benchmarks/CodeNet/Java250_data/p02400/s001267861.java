import java.io.*;
  
class Main{
	public static void main(String[] args) throws IOException{

		double x,men,shu;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		x = Double.parseDouble(str);

		men = x * x * Math.PI;
		shu = 2 * Math.PI * x;

		System.out.printf("%1.6f %1.6f", men, shu);
    	}
}