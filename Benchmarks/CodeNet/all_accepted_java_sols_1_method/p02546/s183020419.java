import java.util.*;
import java.lang.*;

class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		int len = str.length();
		if(str.charAt(len-1) == 's')str += "es";
		else str += "s";
		System.out.println(str);
		
	}
}