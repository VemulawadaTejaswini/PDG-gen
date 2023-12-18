import java.io.*;
class Main {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int x = Integer.parseInt(str);
		if(1<x & x<100) {
		  int equal = x*x*x;
		  System.out.println(equal);
		}
	}

}