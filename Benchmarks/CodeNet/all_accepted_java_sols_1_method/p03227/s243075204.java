import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();

		if(s.length()==3) {
			System.out.println(s.substring(2, 3)+s.substring(1, 2)+s.substring(0, 1));
		}else {
			System.out.println(s);
		}
	}

}
