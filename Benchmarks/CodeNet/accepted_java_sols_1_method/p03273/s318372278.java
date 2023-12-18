import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			String[] A = new String[h]; 
			char[][] a = new char[h][w];
			List<Integer> tate = new ArrayList<Integer>();
			List<Integer> yoko = new ArrayList<Integer>();
			
			for(int i=0;i<h;i++) {
				A[i] = sc.next();
			}
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					a[i][j]=A[i].charAt(j);
				}
			}
			
			boolean flg;
			
			for(int i=0;i<h;i++) {
				flg = true;
				for(int j=0;j<w;j++) {
					if(a[i][j]=='#') {
						flg = false;
						break;
					}
				}
				if(flg) {
					tate.add(i);
				}
				
			}
			
			for(int j=0;j<w;j++) {
				flg = true;
				for(int i=0;i<h;i++) {
					if(a[i][j]=='#') {
						flg = false;
						break;
					}
				}
				if(flg) {
					yoko.add(j);
				}
				
			}
			
			for(int i=0;i<h;i++) {
				if(tate.contains(i)) {
					continue;
				}
				for(int j=0;j<w;j++) {
					if(yoko.contains(j)) {
						continue;
					}
					System.out.print(a[i][j]);
				}
				System.out.println("");
			}
			
		}
	}