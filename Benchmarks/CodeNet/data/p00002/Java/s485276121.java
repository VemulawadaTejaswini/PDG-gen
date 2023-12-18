import java.io.*;
public class Main{
	public static void main(String[] args)  throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		while((str=br.readLine())!=null){
			String[] num=str.split(" ");
			int sum=Integer.parseInt(num[0])+Integer.parseInt(num[1]);
			System.out.println(String.valueOf(sum).length());
		}
	}

}