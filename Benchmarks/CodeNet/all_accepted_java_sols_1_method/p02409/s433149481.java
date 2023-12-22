import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int OffHouse[][][] = new int[4][3][10];
		for(int i=0; i<n; i++){

			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			OffHouse[b-1][f-1][r-1] += scan.nextInt();
		}
		scan.close();
		for(int i=0; i<4; i++){ //棟
			for(int s=0; s<3; s++){ //階
				for(int t=0; t<10; t++){ //部屋
						System.out.print(" " + OffHouse[i][s][t]);
					}
				System.out.print("\n");
				if(i != 3 && s == 2)
					System.out.println("####################");
			}
		}
	}

}