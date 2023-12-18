import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		

		String input1 = sc.next();
		String input2 = sc.next();

		int width;
		int height;

		width = Integer.parseInt(input1);
		height = Integer.parseInt(input2);
	
		int menseki = width * height;
		int syuu = width * 2 + height * 2;
		System.out.println(menseki + " " + syuu);
	}
}