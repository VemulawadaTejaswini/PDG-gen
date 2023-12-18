import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] s = str.split(" ");
		ArrayList<String> a = new ArrayList<>();
		for(String ss:s) {
			ss = ss.replace(",", "");
			ss = ss.replace(".", "");
			if(3<=ss.length() && ss.length()<=6) {
				a.add(ss);
			}
		}
		System.out.println(String.join(" ", a));
		
	}
}

