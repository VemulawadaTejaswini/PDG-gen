import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int abc[][][] = new int[5][4][11];
		int i;
		for(i=0;i<n;i++) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int x=scan.nextInt();
			abc[a][b][c]=x;
		}
		for(int a=1;a<5;a++) {
			for(int b=1;b<4;b++) {
				for(int c=1;c<11;c++) {
					System.out.printf(" "+abc[a][b][c]);
				}
				System.out.println();
			}
			if(a<4)
				System.out.println("####################");
			}
		System.out.println("");
		scan.close();
}
}
