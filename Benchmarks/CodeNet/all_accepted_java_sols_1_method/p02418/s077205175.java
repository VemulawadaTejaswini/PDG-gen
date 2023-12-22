import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		String inbase = std.nextLine();
		String inmatch = std.nextLine();

		inbase += inbase;
		if(inbase.indexOf(inmatch) == -1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}