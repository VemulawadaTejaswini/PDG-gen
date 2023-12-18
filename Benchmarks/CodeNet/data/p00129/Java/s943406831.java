import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			int wx[] = new int[n];
			int wy[] = new int[n];
			int r[] = new int[n];
			for(int i=0;i<n;i++) {
				wx[i] = sc.nextInt();
				wy[i] = sc.nextInt();
				r[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			int tx[] = new int[m];
			int ty[] = new int[m];
			int sx[] = new int[m];
			int sy[] = new int[m];
			for(int i=0;i<m;i++) {
				tx[i] = sc.nextInt();
				ty[i] = sc.nextInt();
				sx[i] = sc.nextInt();
				sy[i] = sc.nextInt();
			}

			for(int s=0;s<m;s++) {
				int a = sy[s]-ty[s];
				int b = tx[s]-sx[s];
				int c = -(a*sx[s]+b*sy[s]);
				boolean danger = true;
				for(int w=0;w<n;w++) {
					boolean tInside = (tx[s]-wx[w])*(tx[s]-wx[w])+(ty[s]-wy[w])*(ty[s]-wy[w])<r[w]*r[w];
					boolean sInside = (sx[s]-wx[w])*(sx[s]-wx[w])+(sy[s]-wy[w])*(sy[s]-wy[w])<r[w]*r[w];
					if (sInside!=tInside) {
						danger = false;
						break;
					}
					if (sInside && tInside) {
						continue;
					}
					double dSq = (a*wx[w]+b*wy[w]+c)*(a*wx[w]+b*wy[w]+c)/(double) (a*a+b*b);
					//点と線分なので、点と直線の距離では交差しているかの判定ができなかった
					if (dSq<=r[w]*r[w]) {
						danger = false;
						break;
					}
				}
				System.out.println(danger ? "Danger" : "Safe");
			}
		}
	}

}