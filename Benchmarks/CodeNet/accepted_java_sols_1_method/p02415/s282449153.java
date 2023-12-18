import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			char c;
			for( int i=0; i<str.length(); i++ ){
				c = str.charAt(i);
				if( Character.isUpperCase(c) ) c = Character.toLowerCase(c);
				else if( Character.isLowerCase(c) ) c = Character.toUpperCase(c);
				System.out.print(c);
			}
			System.out.println();
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}