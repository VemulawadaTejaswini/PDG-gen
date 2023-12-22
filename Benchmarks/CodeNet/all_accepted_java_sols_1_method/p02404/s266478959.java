import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		while(h!=0 && w != 0){
			for(int j=0;j<w;j++) {
					System.out.print("#");
			}
			System.out.println();
			
			for(int i=0; i<h-2 ;i++) {
				System.out.print("#");
				for(int k = 0;k < w-2;k++) {
					System.out.print(".");
				}
				System.out.print("#");
				System.out.println();
			}
			
			for(int j=0;j<w;j++) {
				System.out.print("#");
			}
			System.out.println();
			h = sc.nextInt();
			w = sc.nextInt();
			System.out.println();
		}
		sc.close();
	}
}

