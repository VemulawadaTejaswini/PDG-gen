import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		String s;
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		if(s.contains("9"))
			System.out.print("Yes");
		else
			System.out.print("No");
		
	}
}
