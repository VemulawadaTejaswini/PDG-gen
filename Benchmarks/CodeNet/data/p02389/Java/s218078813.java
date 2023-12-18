import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) {
		String str  = null;

		try(BufferedReader br = new BufferedReader (new InputStreamReader (System.in))){
			str = br. readLine();

			String str1 = new String(str);
			String[] str1Ary = str1.split(" ");
			int a = Integer.parseInt(str1Ary[0]);
			int b = Integer.parseInt(str1Ary[1]);

			System.out.println(a*b +" " +2*(a+b));
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}