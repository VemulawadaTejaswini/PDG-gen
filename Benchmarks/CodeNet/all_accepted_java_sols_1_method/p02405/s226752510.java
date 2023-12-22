import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		while(0 < 1) {
			int tate = sc.nextInt();
			int yoko = sc.nextInt();
			if(tate == 0 && yoko == 0) break;
			for(int i = 0 ; i < tate ; i++ ) {
				if(i % 2 == 0) {
					for(int j = 0 ; j < yoko ; j++) {
						if(j % 2 == 0) System.out.printf("#");
						else System.out.printf(".");
					}
					System.out.printf("\n");
				}
				else {
					for(int j = 0 ; j < yoko ; j++) {
						if(j % 2 == 0) System.out.printf(".");
						else System.out.printf("#");
					}
					System.out.printf("\n");
				}
			}
			System.out.printf("\n");
		}
		sc.close();
	}	
}
