import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String s = buf.readLine();
		String p = buf.readLine();
		String str1;

		str1 = s+s;

		if(str1.contains(p) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}