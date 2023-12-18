import java.io.*;

public class Main0020{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
			String s;
			while((s=reader.readLine()) != null){
				String t=s.toUpperCase();
				System.out.println(t);
			}
		}catch(IOException e){
			System.exit(0);
		}
	}
}