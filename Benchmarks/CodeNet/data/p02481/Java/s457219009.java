import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			String[] linearr = line.split(" ");
			int a = Integer.parseInt(linearr[0]);
			int b = Integer.parseInt(linearr[1]);
			System.out.println(a*b + " "+ 2*(a+b));
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("??°????????£????????????");
		}
	}
}