import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		String[] token = input.split(" ");
		int a = Integer.parseInt(token[0]);
		int b = Integer.parseInt(token[1]);
		System.out.println(a*b + " " + 2*(a+b));
	}
}