import java.io.*;

class Main{
	public static void main (String arg[]){
		int num;
		String buf;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			buf = br.readLine();
			num = Integer.parseInt(buf);
			System.out.print(num*num*num);
			System.out.print("\n");
		} catch(Exception e ) {
		}
	}
}