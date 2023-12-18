import java.io.IOException;
import java.util.Scanner;




public class Main {

	public static void main (String[] args) throws IOException{
		Scanner S = new Scanner(System.in);
		String Str = S.nextLine();
		int SI = Integer.parseInt(Str);
		int seconds = SI%60;
		int hour = SI/3600;
		int minute = SI / 60 - hour * 60;
		System.out.println(hour + ":" + minute + ":" + seconds );
		
	}	
}