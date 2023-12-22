import java.util.Scanner;

public class Main {
	public static void main(String[] a){
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int len = str.length();
		for(int i = 0;i < len;i++){
		System.out.print(str.charAt(len - 1 - i));
		}
		System.out.println("");
	}
}