import java.util.Scanner;

public class Main {
	public static void main(String[]args){
			Scanner scan = new Scanner(System.in);
			//System.out.println("??\???");
			String str=scan.next();
			StringBuffer sb = new StringBuffer(str);
			String hantai = sb.reverse().toString();
			System.out.println(hantai);
			
		
		}
}