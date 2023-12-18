import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String input=new Scanner(System.in).nextLine();
		String output=input.substring(0,1)+(input.length()-2)+input.substring(input.length()-1);
		System.out.println(output);
	}
}