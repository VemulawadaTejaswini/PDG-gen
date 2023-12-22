import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		stb.append(sc.next());
		stb.append(stb);
		String str= stb.toString();
		String x = sc.next();
		System.out.println(str.contains(x) ? "Yes" : "No");
		sc.close();
	}
	
}

