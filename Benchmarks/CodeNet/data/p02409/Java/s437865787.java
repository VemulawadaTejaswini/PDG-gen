import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		int apart[][][];
		apart = new int[5][4][11];
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				for(int k = 0 ; k < 11 ; k++) {
					apart[i][j][k] = 0;
				}
			}
		}
		int b,f,r,v;
		for(int i = 0 ; i < data ; i++) {
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			apart[b][f][r] += v;
		}
		for(int i = 1 ; i <= 4 ; i++) {
			for(int j = 1 ; j <= 3; j++) {
				for(int k = 1; k <= 10 ; k++) {
					System.out.printf(" %d",apart[i][j][k]);
				}
				System.out.printf("\n");
			}
			if(i == 4) break;
			System.out.printf("####################\n");
		}
		sc.close();
	}
}
