import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			int area, line;
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String str = buf.readLine();
			String[] n = str.split(" ");
			int a = Integer.parseInt(n[0]);
			int b = Integer.parseInt(n[1]);
			area = a*b;
			line = 2 * (a + b);
			System.out.println(area + " " + line);
		}catch(IOException e){
		}
	}
}

