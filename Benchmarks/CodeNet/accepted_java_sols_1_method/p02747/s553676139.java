import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String total = scanner.nextLine();
		if(total.length()%2 != 0) {
			System.out.println("No");
			return;
		}
		for(int i =0; i<total.length(); i++) {
			if(i%2==0) {
				if(!"h".equals(total.substring(i, i+1))) {
					System.out.println("No");
					return;
				}
			}else {
				if(!"i".equals(total.substring(i, i+1))) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}	
	
}