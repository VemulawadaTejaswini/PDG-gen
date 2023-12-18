import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //??\??????????£??????°
		Integer[][][] building = new Integer[4][3][10];		
		int b;					//b?£?
		int f;					//f???
		int r;					//r???????????¨?±?
		int v;					//v?????\?±?
		
		//?????????
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					building[i][j][j2]=0;
				}
			}
		}
		
		//??\???
		for (int i = 0; i < n; i++) {
			b=sc.nextInt()-1;
			f=sc.nextInt()-1;
			r=sc.nextInt()-1;
			v=sc.nextInt();
			
			building[b][f][r] += v;
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					System.out.print(" "+building[i][j][j2]);
				}
				//??????
				System.out.println();
			}
			//????£??????????????????????
			if(i!=3){
			System.out.println("####################");
			}
		}
	}
}