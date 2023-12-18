import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		double r;
		try{
			while((s=reader.readLine()) !=null){
				r=Double.parseDouble(s);
				System.out.println(r*r*Math.PI+" "+2*r*Math.PI);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}