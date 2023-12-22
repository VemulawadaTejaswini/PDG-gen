import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int home[][][] = new int[4][3][10];

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++){
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int v = sc.nextInt();
			home[b-1][f-1][r-1] += v;
		}
		for (int j=0; j<=4-1; j++){
			for(int k=0; k<=3-1; k++){
				String line = "";
				for(int l=0; l<=10-1; l++){
					line += " "+home[j][k][l];
				}
				System.out.println(line);
			}
			if(j!=3){System.out.println("####################");}
		}
	}
}

