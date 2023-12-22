import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] div = str.split(" ");
		int a =  Integer.parseInt(div[0]);
		int b =  Integer.parseInt(div[1]);
		if (a < b){
			System.out.println("a < b");
		}
		else if (a > b){
			System.out.println("a > b");
		}
		else if (a == b){
			System.out.println("a == b");
		}
	}	
}