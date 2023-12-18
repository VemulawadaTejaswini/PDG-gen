import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String str = buf.readLine();
			int input_time = Integer.parseInt(str);
			int h = input_time/3600;
			int m = (input_time - ( h * 3600))/60;
			int s = input_time % 60;
			System.out.println( h + ":" + m + ":" + s );
			
		} catch(IOException e){
		}
	}
}
