import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] a = scanner.next().split("");
		String[] b = scanner.next().split("");
		
		scanner.close();
		
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i].equals(b[i])) {
				
			} else {
				result++;
			}
		}
		
		System.out.println(result);
	}

}
