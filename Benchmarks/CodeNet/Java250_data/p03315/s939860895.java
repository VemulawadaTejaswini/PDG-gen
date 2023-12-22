import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String a = sc.nextLine();
		String[] b = new String[a.length()];
		for(int i = 0;i < a.length(); i++) {
			String kigou = String.valueOf(a.charAt(i));
			if("+".equals(kigou)) {
				sum += 1;
			} else if("-".equals(kigou)) {
				sum -= 1;
			}
		}
		System.out.println(sum);
	}

}