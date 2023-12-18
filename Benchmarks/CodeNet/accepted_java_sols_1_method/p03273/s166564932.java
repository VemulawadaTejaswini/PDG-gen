import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		in.nextLine();
		int[] yoko = new int[W];
		char[][] ans = new char[H][W];
		//System.out.println(H);
		for(int i=0; i<H; i++) {
			String s = in.nextLine();
			if(s.contains("#")) {
				//System.out.println(i + " contain:" + s);
				ans[i] = s.toCharArray();
				for(int j=0; j<W; j++) {
					if(ans[i][j]=='#') {
						yoko[j]=1;
					}
				}
			}
		}
		
		for(int i=0; i<H; i++) {
			if(ans[i][0]!='.' && ans[i][0]!='#') {
				continue;
			}
			for(int j=0; j<W; j++) {
				if(yoko[j]==1) {
					System.out.print(ans[i][j]);
				}
			}
			System.out.println();
		}
		
	
		in.close();
	}
}
