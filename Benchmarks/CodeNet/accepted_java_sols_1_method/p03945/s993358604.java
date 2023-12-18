import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char[] board = input.toCharArray();
		int totalPlacements = 0;
		char current = board[0];
		for (int i = 1; i < board.length; i++) {
			if (board[i] != current) {
				totalPlacements++;
				current = board[i];
			}
		}
		System.out.println(totalPlacements);
		
	}
	
	
}