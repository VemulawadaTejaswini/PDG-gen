import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		String S[]=new String[H];
		char C[][] = new char[H][W];
		for(int i=0;i<H;i++) {
			S[i]=sc.next();
			C[i]=S[i].toCharArray();
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				int c=0;
				if(C[i][j]=='.') {
					for(int k=-1;k<=1;k++) {
						if(i+k<0||i+k>=H)continue;
						for(int l=-1;l<=1;l++) {
							if(j+l<0||j+l>=W)continue;
							if(C[i+k][j+l]=='#') {
								c++;
							}
						}
					}
					C[i][j]=(char)('0'+c);
				}
			}
		}
		
		for(int i=0;i<H;i++) {
			S[i]=String.valueOf(C[i]);
			System.out.println(S[i]);
		}
		
	}
}
