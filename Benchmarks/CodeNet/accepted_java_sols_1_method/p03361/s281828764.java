import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();
		String[] s = new String[H+1];
		for(int i =0;i<H;i++) {
//			System.out.println(sc.nextLine());
			s[i]=sc.nextLine();
//			System.out.println(s[i]);
		}
		boolean[][] b = new boolean[H+2][W+2];
		for(int i =0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(s[i].charAt(j)=='#') {
					b[i+1][j+1]=true;
				}
			}
		}
		boolean ans =true;
		for(int i =1;i<=H;i++) {
			for(int j =1;j<=W;j++) {
				if(b[i][j]==true) {
					if(b[i-1][j]==false&&
				   b[i][j-1]==false&&
				   b[i][j+1]==false&&
				   b[i+1][j]==false) {
					ans =false;
//					System.out.println("Yes");
				}}
			}
		}
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
