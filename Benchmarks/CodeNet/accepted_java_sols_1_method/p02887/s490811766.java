import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		System.out.println(sc.next().replaceAll("(.)\\1*", "$1").length());
	}
}
