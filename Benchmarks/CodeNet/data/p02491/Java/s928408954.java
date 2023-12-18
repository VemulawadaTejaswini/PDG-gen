import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		while((s=reader.readLine())!=null){
			t=s.split(" ");
			int a=Integer.parseInt(t[0]);
			int b=Integer.parseInt(t[1]);
			System.out.println(a/b+" "+a%b+" "+(double)a/b);
		}
	}
}