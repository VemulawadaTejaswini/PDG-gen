import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;double v,u,y;
		while((t=bf.readLine())!=null){
			v=Double.parseDouble(t);
			y=v*v/19.6;
			System.out.println((int)Math.ceil((y+5)/5));
		}
	}
}