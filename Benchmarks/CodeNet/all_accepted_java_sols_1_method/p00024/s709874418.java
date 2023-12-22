import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String s;
		double v;
		double high;
		int f;
		try{
			while((s=reader.readLine()) !=null){
				v=Double.parseDouble(s);
				high = (v*v)/19.6;
				f = (int)high/5;
				System.out.println(f+2);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}