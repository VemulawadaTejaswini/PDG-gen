import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = "#";
		while (true) {
			Integer h = sc.nextInt();
			Integer w = sc.nextInt();
			
			if(h == 0 && w == 0) {
				return;
			}
			
			for(Integer i = 0; i < w; i++) {
				System.out.print(a);
			}
			System.out.println();
			
			for(Integer i = 0; i < h-2; i++) {
				System.out.print(a);
				for (Integer j = 0;j < w-2;j++) {
					System.out.print(".");
					
				}
				
				System.out.print(a);
				System.out.println();
			}
			
			
			
			for(Integer i = 0; i < w; i++) {
				System.out.print(a);
			}
			System.out.println();
			System.out.println();
				
		}
		

	}
}
