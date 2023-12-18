import java.io.*;

class MAIN{
	public static void main(String args[]){

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		try{
			String str = br.readLine();
			int x = Integer.parseInt(str);
			System.out.println(x*x*x);
		}
		catch(IOException e){};
	}
}