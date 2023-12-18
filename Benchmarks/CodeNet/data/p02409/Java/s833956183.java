import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int abc[][][] = new int[4][3][10];
		int i;
		for(i=0;i<n;i++) {
			int a=scan.nextInt()-1;
			int b=scan.nextInt()-1;
			int c=scan.nextInt()-1;
			int x=scan.nextInt()-1;
			abc[a][b][c]=x;
		}
		for(int a=0;a<4;a++) {
			for(int b=0;b<3;b++) {
				for(int c=0;c<10;c++) {
					System.out.printf(" "+abc[a][b][c]);
				}
				System.out.println();
			}
			if(a<3)
				System.out.println("####################");
			}
		System.out.println("");
		scan.close();
}
}
