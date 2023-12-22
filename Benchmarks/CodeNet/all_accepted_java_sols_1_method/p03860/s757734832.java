import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		String string = sc.nextLine();
		String[] strings = string.split(" ");

		for(int i = 0; i < strings.length; i++) {
			sb.append(strings[i].substring(0, 1));
		}
		
		System.out.println(sb);
	}

}