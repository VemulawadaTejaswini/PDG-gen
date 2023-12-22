import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int suma = 0;
		int[][] sheet = new int[r][c];

		for(int i=0; i<r; i++){
			for(int s=0; s<c; s++){
				sheet[i][s] = scan.nextInt();
			}
		}
		for(int i=0; i<r; i++){
			int sumw = 0;
			for(int s=0; s<c; s++){
				sumw += sheet[i][s];
				System.out.print(sheet[i][s] + " ");
				if(s == c-1){
					System.out.print(sumw + "\n");
					sumw = 0;
				}
			}
		}
		for(int i=0; i<c; i++){
			int sumh= 0;
			for(int s=0; s<r; s++){
				suma += sheet[s][i];
				sumh += sheet[s][i];
			}
			System.out.print(sumh + " ");
			if(i == c-1)
				System.out.print(suma + "\n");
		}

	}

}