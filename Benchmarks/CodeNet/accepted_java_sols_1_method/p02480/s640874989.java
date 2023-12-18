import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=reader.readLine())!=null){
			int n=Integer.parseInt(s);
			System.out.println(n*n*n);
		}
	}
}