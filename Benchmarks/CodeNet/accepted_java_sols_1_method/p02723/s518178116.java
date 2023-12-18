import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.next().split("");
		System.out.println(str[2].equals(str[3])&& str[4].equals(str[5]) ? "Yes": "No");
	}
}
