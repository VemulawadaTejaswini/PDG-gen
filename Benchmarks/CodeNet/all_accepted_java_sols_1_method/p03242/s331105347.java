import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		str = str.replaceAll("9", "A");
		str = str.replaceAll("1", "9");
		str = str.replaceAll("A", "1");
		System.out.println(str);
	}
}