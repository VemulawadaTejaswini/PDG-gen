import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;double v,u,y;
		while((t=bf.readLine())!=null){
			v=Double.parseDouble(t);
			u=v/9.8;y=4.9*u*u;
			System.out.println((int)Math.ceil((y+5)/5));
		}
	}
}