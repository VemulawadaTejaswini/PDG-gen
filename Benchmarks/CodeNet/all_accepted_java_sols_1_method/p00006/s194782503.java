import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String out="";
		for(int i=str.length()-1;i>=0;i--){
			out+=str.substring(i,i+1);
		}
		System.out.println(out);
	}

}