import java.util.Scanner;
public class Main{

	static void Print(int[][] x) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(" "+x[i][j]);
			}
			System.out.println("");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1[][] = new int[3][10];
		int a2[][] = new int[3][10];
		int a3[][] = new int[3][10];
		int a4[][] = new int[3][10];
		int n = sc.nextInt();

		for(int i=0;i<n;i++) {
			int b = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			int count = sc.nextInt();

			if(b==1)a1[f-1][r-1]+=count;
			else if(b==2)a2[f-1][r-1]+=count;
			else if(b==3)a3[f-1][r-1]+=count;
			else if(b==4)a4[f-1][r-1]+=count;
			else System.out.println("E");
		}

		Print(a1);
		System.out.println("####################");
		Print(a2);
		System.out.println("####################");
		Print(a3);
		System.out.println("####################");
		Print(a4);

		sc.close();
	}
}

