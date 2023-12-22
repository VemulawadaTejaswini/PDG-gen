import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st1 = sc.next();
		String st2 = sc.next();
		
		sc.close();
		
		int count = 0;
		
		char[] ch1 = st1.toCharArray();
		char[] ch2 = st2.toCharArray();
		
		for(int i = 0; i < st1.length(); i++) {
			if (ch1[i] != ch2[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
