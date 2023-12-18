import java.io.*;
class Main{
	public static void main(String args[]){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try{
			String strS = in.readLine();
			int intS = (int)Integer.parseInt(strS);
			int h = intS / 3600;
			int m = (intS - h * 3600) / 60;
			int s = intS - (h * 3600 + m * 60);
			System.out.println(h + ":" + m + ":" + s);
		}catch(IOException e){
			System.out.println("error");
		}
	}
}