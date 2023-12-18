import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int word = stdin.nextInt();
		int bit = word * 32;
		System.out.println(bit);
	}

}