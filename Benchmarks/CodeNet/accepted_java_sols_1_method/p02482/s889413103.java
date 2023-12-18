import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			String[] linearr = line.split(" ");
			int a = Integer.parseInt(linearr[0]);
			int b = Integer.parseInt(linearr[1]);
			if(a > b){
				System.out.println("a > b");
			}else if(a <  b){
				System.out.println("a < b");
			}else{
				System.out.println("a == b");
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}