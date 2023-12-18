import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int house[][][] = new int[4][3][10];
		int n = scan.nextInt();
		int b,f,r,v,k=0;
		
		while(k<n) {
			b = scan.nextInt()-1;
			f = scan.nextInt()-1;
			r = scan.nextInt()-1;
			v = scan.nextInt();
			house[b][f][r] +=  v;
			if(house[b][f][r] < 0) house[b][f][r]=0;
			k++;
		}

		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int s=0;s<10;s++) {
					System.out.print(" "+house[i][j][s]);
				}
				System.out.println();
			}
			System.out.println("####################");
		}

		scan.close();
	}

}

