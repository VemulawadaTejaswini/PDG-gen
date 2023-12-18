import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		
		String ans = t.replace('?', 'D');
		System.out.println(ans);
				
		sc.close();
	}
	
}

