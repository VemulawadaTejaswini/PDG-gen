import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				if(h==0&&w==0) break;
				for(int j=0; j<w; j++) {
					System.out.print("#");
				}
				System.out.println();
				for(int i=0; i<h-2; i++) {
					System.out.print("#");
					for(int j=0; j<w-2; j++) {
						System.out.print(".");
					}
					System.out.println("#");
				}
				for(int j=0; j<w; j++) {
					System.out.print("#");
				}
				System.out.println();
				System.out.println();
			}
		}
	}
}
