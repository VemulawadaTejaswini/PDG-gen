import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		char map[][]=new char[h][w];
		for(int i=0;i<h;i++) {
			String str= scan.next();
			for(int j=0;j<w;j++) {
				map[i][j]=str.charAt(j);
			}
		}
		scan.close();
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(map[i][j]=='#'){
					System.out.print('#');
				}else {
					int cnt=0;
					for(int k=-1;k<=1;k++) {
						for(int l=-1;l<=1;l++) {
							if(k==0&& k!=l ||k==-1&&i!=0 || k==1&&i!=h-1) {
								if(l==0&& k!=l || l==-1&&j!=0 || l==1&&j!=w-1) {
									if(map[i+k][j+l]=='#')cnt++;
								}
							}
						}
					}
					System.out.print(cnt);
				}
			}
			System.out.println();
		}
	}
}