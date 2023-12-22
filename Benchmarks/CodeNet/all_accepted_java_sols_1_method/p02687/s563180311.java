import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan01 = new Scanner(System.in);
		String str = scan01.next();

		String abc = "ABC";
		String arc = "ARC";

		if(str.equals(abc)){
			System.out.println("ARC");
		}else if(str.equals(arc)){
			System.out.println("ABC");
		}
			scan01.close();
	}
}