import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String a_str = scanner.next();
		String b_str = scanner.next();
		String c_str = scanner.next();

		int a = Integer.parseInt(a_str);
		int b = Integer.parseInt(b_str);
		int c = Integer.parseInt(c_str);

		if(a < b  && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

    	scanner.close();
    }
}

