import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean isBothNumberMenus = true;
		int index = 1;
		while(isBothNumberMenus) {
			if(a - index < 0 && b - index < 0) {
				System.out.println("IMPOSSIBLE");
				break;
			}
			
			if(Math.abs(a - index) == Math.abs(b - index)) {
				System.out.println(index);
				break;
			}
			index++;
			
		}
		

		
		

		
		
	}	

}