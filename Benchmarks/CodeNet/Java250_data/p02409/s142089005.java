import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][][] house = new int[4][3][10];

		for(int i=0;i<n;i++){
			int tou = scan.nextInt();
			int floor = scan.nextInt();
			int room = scan.nextInt();
			int people = scan.nextInt();

			house[tou-1][floor-1][room-1]=house[tou-1][floor-1][room-1]+people;
		}

		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
					if(house[i][j][k]>0){
						System.out.print(" "+house[i][j][k]);
					}else{
						System.out.print(" 0");
					}
				}
				System.out.println();
			}
			if(i!=3){
				for(int j=0;j<20;j++){
					System.out.print("#");
				}
				System.out.println();
			}
		}

	}

}