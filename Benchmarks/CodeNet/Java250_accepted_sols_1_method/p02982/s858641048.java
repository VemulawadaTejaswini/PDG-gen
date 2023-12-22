import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][]x = new int[n][d];

		for(int i=0; i<n; i++) {
		for(int j=0; j<d; j++) {
			x[i][j] = sc.nextInt();	
		}
		}
		int cou = 0;
		for(int i=0; i<n-1;i++) {
		for(int j=i+1; j<n; j++) {
			int kyori = 0;
			for(int k=0; k<d; k++) {
				kyori +=  (x[i][k]-x[j][k])*(x[i][k]-x[j][k]);
		}
			for(int l=0; l<=kyori; l++) {
				if(kyori == l*l) {
					cou++;
				}
		}
		}
		}
			System.out.println(cou);
		}
	}
