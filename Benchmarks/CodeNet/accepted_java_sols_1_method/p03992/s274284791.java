import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		str = br.readLine();
		for(int i=0;i<str.length(); i++){
			System.out.print(str.charAt(i));
			if(i==3){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}