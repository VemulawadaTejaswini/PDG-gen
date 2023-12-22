import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String[] args){
		try{
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			String deleteMaru = input.replace("o", "");
			int maruNum = input.length() - deleteMaru.length();
			int finishedGames = input.length();
			
			if(15 - finishedGames + maruNum >= 8){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		} catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}