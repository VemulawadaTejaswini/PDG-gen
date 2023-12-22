import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String T = scan.nextLine();

		int amt = S.length();
		String T_part = T.substring(0, amt);

		if(T_part.equals(S) && T.length() == (amt + 1)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		scan.close();
	}
}