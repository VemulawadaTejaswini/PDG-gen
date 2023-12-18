import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while (true) {
			int n = scn.nextInt();
			if(n==0) break;
			int firstm = scn.nextInt();
			int[] firstlinex = new int[firstm];
			int[] firstliney = new int[firstm];
			for(int k=0;k<firstm;k++){
				firstlinex[k] = scn.nextInt();
				firstliney[k] = scn.nextInt();
			}
			for(int k=1;k<=n;k++){
				int m = scn.nextInt();
				int[] x = new int[m];
				int[] y = new int[m];
				for(int s=0;s<m;s++){
					x[s] = scn.nextInt();
					y[s] = scn.nextInt();
				}
				for(int l=0;l<4;l++){
					for(int s=0;s<firstm;s++){
						double tmpx=-firstliney[s];
						double tmpy=firstlinex[s];
						firstlinex[s]=(int)tmpx;
						firstliney[s]=(int)tmpy;
					}
					boolean b1 = true;
					boolean b2 = true;
					int dx1 = firstlinex[0]-x[0];
					int dy1 = firstliney[0]-y[0];
					int dx2 = firstlinex[0]-x[m-1];
					int dy2 = firstliney[0]-y[m-1];
					for(int s=0;s<m;s++){
						if(firstlinex[s]!=x[s]+dx1||firstliney[s]!=y[s]+dy1){
							b1 = false;
						}
						if(firstlinex[s]!=x[m-s-1]+dx2||firstliney[s]!=y[m-s-1]+dy2){
							b2 = false;
						}
					}
					if(b1||b2){
						pr.println(k);
						break;
					}
				}
			}
			pr.println("+++++");
		}
		pr.flush();
		scn.close();
	}



}