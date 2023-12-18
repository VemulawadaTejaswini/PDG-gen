import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			if(h == 0 && w == 0) {
				break;
			}else {
				for(int i = 0; i < w; i++) {
					System.out.print("#");
				}
				System.out.println();
				
				for(int i1 = 0; i1 < h-2; i1++) {
					System.out.print("#");
					for(int i2 = 0; i2 < w-2; i2++) {
						System.out.print(".");
					}
					System.out.println("#");
				}
				
				for(int i = 0; i < w; i++) {
					System.out.print("#");
				}
				System.out.println("\r\n");
			}
		}
	}
}

