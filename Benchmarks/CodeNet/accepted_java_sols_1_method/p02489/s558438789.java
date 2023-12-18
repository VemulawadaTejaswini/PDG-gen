import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i=1;
		int x;
		try{
			while(null != (line=reader.readLine())){
				x = Integer.parseInt(line);
				if(x==0){
					return;
				}
				System.out.println("Case "+i+": "+x);
				i++;
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}