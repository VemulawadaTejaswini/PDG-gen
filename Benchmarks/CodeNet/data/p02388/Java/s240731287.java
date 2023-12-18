import  java.io.*;

class Main{
	public static void main(String args[]){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    String str=reader.readLine();
		    int x =Integer.parseInt(str);
		    System.out.println(x*x*x);
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}