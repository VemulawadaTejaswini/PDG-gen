import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		boolean check = a.contains("A") && a.contains("B");
		System.out.println(check ? "Yes" : "No");
	}
}
