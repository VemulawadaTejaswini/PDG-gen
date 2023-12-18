import java.io.*;

class main{
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null) {
			int x=Integer.parseInt(str);
			x=x*x*x;
			System.out.println(x);
		}
	}
}