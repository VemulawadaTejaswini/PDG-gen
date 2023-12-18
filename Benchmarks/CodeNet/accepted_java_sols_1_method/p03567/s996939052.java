import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		if(S.matches(".*AC.*")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
