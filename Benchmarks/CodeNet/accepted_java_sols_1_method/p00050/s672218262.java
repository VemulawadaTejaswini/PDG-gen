import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String w ="fjyfyucu7t6r5dc";
		s = s.replaceAll("apple", w);
		s = s.replaceAll("peach", "apple");
		s = s.replaceAll(w, "peach");
		System.out.println(s);
	}
}
