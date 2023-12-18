import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] output = new char[1200];

		for(int i = 0;i < input.length();i++){
			if('A' <= input.charAt(i) && input.charAt(i) <= 'Z') output[i] = Character.toLowerCase(input.charAt(i));
			else if('a' <= input.charAt(i) && input.charAt(i) <= 'z') output[i] = Character.toUpperCase(input.charAt(i));
			else output[i] = input.charAt(i);
		}
		for(int i = 0;i < input.length();i++){
			System.out.print(output[i]);
		}
		System.out.println();
	}
}
