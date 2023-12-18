import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][][] rooms = new int[4][3][10];
		for(int i=0;i<n;i++){
			rooms[scan.nextInt()-1][scan.nextInt()-1][scan.nextInt()-1] += scan.nextInt();
		}
		for(int i=0; i<4; i++){
			for(int j=0;j<3;j++){
				for(int k=0; k<10; k++){
					System.out.print(" "+rooms[i][j][k]);
				}
				System.out.println();
			}
                        if(i==3) break;
			for(int l=0; l<20; l++) System.out.print("#");
			System.out.println();
		}
	}
}