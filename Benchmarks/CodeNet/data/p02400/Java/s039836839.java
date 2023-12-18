import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		double r=Integer.parseInt(str);
		
		System.out.println(String.format("%.6f",r*r*Math.PI)+" "+String.format("%.6f",2*r*Math.PI));
	}
}