import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;double v,y;
		while((t=bf.readLine())!=null){
			v=Double.parseDouble(t);
			y=v*v/98.0+1.0;
			System.out.println((int)Math.ceil(y));
		}
	}
}