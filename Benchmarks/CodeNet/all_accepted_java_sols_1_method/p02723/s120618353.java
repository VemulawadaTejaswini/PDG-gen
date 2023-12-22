import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		String str=in.readLine();
		
		boolean equals=str.charAt(2)==str.charAt(3)&&str.charAt(4)==str.charAt(5);
		if(equals) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		

	}

}
