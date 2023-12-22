import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int S =  Integer.parseInt(str);
		int h = S/3600;
		int tmp = S%3600;
		int m = tmp/60;
		int s = tmp%60;
		System.out.println(h+":"+m+":"+s);
	}	
}