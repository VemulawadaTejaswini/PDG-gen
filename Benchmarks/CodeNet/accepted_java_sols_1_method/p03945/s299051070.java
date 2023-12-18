import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String board = s.nextLine();
		int count = 0;
		char cur = board.charAt(0);
		for(int x=1;x<board.length();x++) {
			if(board.charAt(x)!=cur) {
				count++;
				cur = board.charAt(x);
			}
		}
		
		System.out.println(count);
	}
}