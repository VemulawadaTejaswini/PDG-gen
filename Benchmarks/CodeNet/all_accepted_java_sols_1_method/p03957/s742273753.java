import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		Boolean flagC = false;
		Boolean flagF = false;
		String res ="No";
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]=='C') {
				flagC = true;
			}
			
			if (arr[i]=='F'&&flagC) {
				res = "Yes";
			}
		}
		System.out.println(res);
	}
}
