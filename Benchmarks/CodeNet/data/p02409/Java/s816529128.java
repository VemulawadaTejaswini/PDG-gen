import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] room=new int[12][10];
		for(int i=0; i<12; i++) {
			Arrays.fill(room[i],0);
		}
		for(int i=0; i<N; i++) {
			int tou=sc.nextInt();
			int kai=sc.nextInt();
			int heya=sc.nextInt();
			int ninzu=sc.nextInt();
			room[(tou-1)*3+kai-1][heya-1]+=ninzu;
		}
		o(room);
	}
	public static void o(int[][] a) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<9; k++) {
					System.out.print(" "+a[i*3+j][k]);
				}
				System.out.println(" "+a[i*3+j][9]);
			}
			if(i!=3) {
				System.out.println("####################");
			}
		}
	}
}
