import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.nextLine();
		str = str.toUpperCase();
		System.out.println(str);
	}
}