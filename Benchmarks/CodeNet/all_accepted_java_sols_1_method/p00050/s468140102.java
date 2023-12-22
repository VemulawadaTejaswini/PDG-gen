import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		String p = "peach";
		String a = "apple";
		
		Pattern pp = Pattern.compile(p);
		Pattern pa = Pattern.compile(a);
		
		String[] nico = sc.nextLine().split(" ");
		for (int i = 0; i < nico.length; i++) {
			if (nico[i].contains(p)) {
				Matcher mp = pp.matcher(nico[i]);
				nico[i] = mp.replaceFirst(a);
			} else if (nico[i].contains(a)) {
				Matcher ma = pa.matcher(nico[i]);
				nico[i] = ma.replaceFirst(p);
			}
			
			if (i != (nico.length - 1)) System.out.print(nico[i] + " ");
			else System.out.println(nico[i]);
		}
	}
}