import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,m;
		int[] width,height;
		int[] w,h;
		int c;
		while(true) {
			n = sc.nextInt();
			if(n==0) {break;}
			m = sc.nextInt();

			c = 0;
			
			width = new int[n+1];
			height = new int[m+1];

			w = new int[1500001];
			h = new int[1500001];

			for(int i=0; i<n; i++) {
				width[i+1] = sc.nextInt() + width[i];
			}
			for(int i=0; i<m; i++) {
				height[i+1] = sc.nextInt() + height[i];
			}

			for(int w0=0; w0<n; w0++) {
				for(int w1=w0; w1<n+1; w1++) {
					w[width[w1]-width[w0]]++;
				}
			}

			for(int h0=0; h0<m; h0++) {
				for(int h1=h0; h1<m+1; h1++) {
					h[height[h1]-height[h0]]++;
				}
			}
			
			for(int j=1; j<1500001; j++) {
				c += w[j] * h[j];
			}
			System.out.println(c);
		}
		sc.close();
	}

}

