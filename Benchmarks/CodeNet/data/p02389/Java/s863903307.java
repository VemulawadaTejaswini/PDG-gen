import java.io.*;

class Main{
	public static void main(String[] args){
		int a,b;
		String buf;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			buf = br.readLine();
			a = Integer.parseInt(buf);
			buf = br.readLine();
			b = Integer.parseInt(buf);
			System.out.println(a*b +" "+ 2*(a+b));
		}catch(Exception e) {
		 }
	 }
}	