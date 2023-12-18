import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		Scanner std = new Scanner(System.in);
		String a = std.next();
		String b = std.next();

		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) != b.charAt(i))
				count++;
		}
		System.out.println(count);
	}

}
