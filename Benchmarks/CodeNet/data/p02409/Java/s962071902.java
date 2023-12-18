import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b,f,r,v;
		int[][] num = new int[12][10];
		
		for (int a=0;a<n;a++){
			b=sc.nextInt();f=sc.nextInt();
			r=sc.nextInt();v=sc.nextInt();
			//input
			switch (b){
			case 1:
				num[f-1][r-1] +=v;
				break;
			case 2:
				num[f+2][r-1] +=v;
				break;
			case 3:
				num[f+5][r-1] +=v;
				break;
			case 4:
				num[f+8][r-1] +=v;
				break;
			}//swicth
		}//for
		
		for (int a=1;a<=n+1;a++){
			for (int c=1;c<=3;c++){
				for (int d=0;d<10;d++){
					System.out.print(" "+num[c*a-1][d]);
				}
				System.out.println();
			}
			System.out.println("####################");
		}
	}
}