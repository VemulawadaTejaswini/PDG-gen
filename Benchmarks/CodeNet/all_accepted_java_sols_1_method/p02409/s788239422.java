import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b,f,r,v;
		int[][][] num = new int[4][3][10];
		for (int a=0;a<4;a++){
			for (int c=0;c<3;c++){
				for (int d=0;d<10;d++){
					num[a][c][d] = 0;
				}
			}
		}
		for (int a=0;a<n;a++){
			b=sc.nextInt();f=sc.nextInt();
			r=sc.nextInt();v=sc.nextInt();
			num[b-1][f-1][r-1] += v;
		}
		for (int a=0;a<4;a++){
			for (int c=0;c<3;c++){
				for (int d=0;d<10;d++){
					System.out.print(" "+num[a][c][d]);
				}
				System.out.println();
			}
			if (a<3){
				System.out.println("####################");
			}
		}
	}
}