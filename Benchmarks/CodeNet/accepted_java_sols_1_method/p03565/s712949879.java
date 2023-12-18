import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next().replaceAll("\\?",".");
		String b = sc.next();
		for(int i = a.length() - b.length(); i >= 0; i--) {
			String regex = a.substring(i, i+b.length());
			if(b.matches(regex)) {
				System.out.println(a.replaceFirst(a.substring(0,i)+regex,a.substring(0,i)+b).replaceAll("\\.","a"));
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}