import java.io.*;
class main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader
			(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println(Math.pow(num,3));
	}
}