
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] rooms = new int[10][12];
		for(int i=0;i<n;i++) {
			int b= sc.nextInt(),f=sc.nextInt(),r=sc.nextInt(),v=sc.nextInt();
			rooms[r-1][3*(b-1)+f-1]+=v;
		}

		for(int i=0; i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++) {
					System.out.print( " " + rooms[k][3*i+j]);
				}
				System.out.println();
			}
			if(i<3) {
				System.out.println("####################");
			}
		}
	}
}

