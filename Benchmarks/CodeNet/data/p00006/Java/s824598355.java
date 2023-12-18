import java.util.Scanner;


 class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuffer sb = new StringBuffer(input);
		sb = sb.reverse();
		System.out.println(sb);
	}

}