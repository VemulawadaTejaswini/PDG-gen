import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

		String str =  br.readLine();

		int s = Integer.parseInt(str);

		int h = s / 3600;
		s = s - h * 3600;

		int m = s / 60;
		s = s - m * 60;

		System.out.println(h + ":" + m + ":" + s);
	}
}