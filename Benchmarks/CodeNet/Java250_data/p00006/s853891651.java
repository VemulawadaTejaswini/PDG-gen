import java.util.Scanner;
import java.lang.*;

public class Main{

	public static String reverse(String str){
		
			if(str.length() == 1){
				return str;
			}else{
				
				return  reverse(str.substring(1)) + str.substring(0,1);
				
			}
		
		}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		str = reverse(str);
		
		System.out.println(str);
		
		
		
	}

}