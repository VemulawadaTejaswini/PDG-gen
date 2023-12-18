import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String p = scan.nextLine();
		s += s.substring(0, s.length() - 1);
		if(s.indexOf(p) == -1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}