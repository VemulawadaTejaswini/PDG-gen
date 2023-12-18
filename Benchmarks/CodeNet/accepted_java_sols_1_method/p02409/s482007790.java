import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][][] room=new int[4][3][10];
		for(int t=0; t<n;t++) {
			int b=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
			int v=sc.nextInt();
			room[b-1][f-1][r-1]+=v;
		}

		for(int B=0;B<3;B++) {
			for(int F=0;F<3;F++) {
				for(int R=0;R<10;R++) {
					System.out.print(" "+room[B][F][R]);
				}
				System.out.println();
			}
			for(int x=0;x<20;x++) {
				System.out.print("#");
			}
			System.out.println();
		}
		for(int F=0;F<3;F++) {
			for(int R=0;R<10;R++) {
				System.out.print(" "+room[3][F][R]);
			}
			System.out.println();
		}


	}
}

