import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
		String s = input.readLine();
		int x=Integer.parseInt(s);
		System.out.println(x*x*x);
		}catch(IOException e){}
		}

	}