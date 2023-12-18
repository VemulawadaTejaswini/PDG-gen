import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str = br.readLine();
			String[] strArray = str.split(" ");
			
			int x = Integer.parseInt(strArray[0]);
			int y = Integer.parseInt(strArray[2]);
			if(strArray[1].equals("?")){
				  break;
			}
			if(strArray[1].equals("+")){
				System.out.println(x+y);
			}
			if(strArray[1].equals("-")){
				System.out.println(x-y);
			}
			if(strArray[1].equals("*")){
				System.out.println(x*y);
			}
			if(strArray[1].equals("/")){
				System.out.println(x/y);
			}
		}
	}
}