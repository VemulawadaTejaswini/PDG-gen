import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String sub = s.substring(2,s.length()-1);

		if (s.startsWith("A") && sub.contains("C") && sub.indexOf('C')==sub.lastIndexOf('C')){
			int idxC = sub.indexOf('C')+2;
			for (int i=1;i<s.length(); i++){
				if (i==idxC) continue;
				if (Character.isUpperCase(s.charAt(i))) {
					System.out.println("WA");
					System.exit(0);
				}
			}
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
	}
}