import java.io.*;

class Main{
	public static void main(String[] args){
		int a,b;
		String buf;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String buf1 = br.readLine();
			a = Integer.parseInt(buf1);
			String buf2 = br.readLine();
			b = Integer.parseInt(buf2);
			System.out.println(a*b +" "+ 2*(a+b));
		}catch(Exception e) {
		 }
	 }
}	

	