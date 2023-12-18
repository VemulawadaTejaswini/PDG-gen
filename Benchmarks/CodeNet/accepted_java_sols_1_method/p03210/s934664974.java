import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()) {
			int x = scanner.nextInt();
			if(x==3||x==5||x==7) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			scanner.close();
		}
	}
	
}