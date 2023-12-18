import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String p = sc.nextLine();

		boolean contain = false;

		if(s.contains(p)) {
			contain = true;
		}

		for(int i = 1;i<p.length();i++) {
			String end = p.substring(0,i);
			String start = p.substring(i);
			if(s.endsWith(end)){
				if(s.startsWith(start)) {
					contain = true;
				}
			}
		}

		if(contain) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}






	}
}
