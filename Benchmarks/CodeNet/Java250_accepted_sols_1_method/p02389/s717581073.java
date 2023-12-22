import java.io.*;
class Main{
	public static void main(String[] args){
		int a,b;
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader   (System.in));
			String str = br.readLine();
			String[] strAry = str.split(" ");
			a = Integer.parseInt(strAry[0]);	
			b = Integer.parseInt(strAry[1]);
			System.out.println(a*b +" "+ 2*(a+b));
		} catch(Exception e) {
		}
	 }
}	