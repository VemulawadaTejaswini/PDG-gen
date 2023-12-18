import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0,m=0;
		int[] width;
		int[] height;
		int counter;
		while(true) {
			counter = 0;
			n = sc.nextInt();
			if(n==0) {break;}
			m = sc.nextInt();
			width = new int[n+1];
			height = new int[m+1];
			
			width[0]=0;
			height[0]=0;
			
			
			for(int i=1;i<n+1;i++) {
				width[i] = sc.nextInt() + width[i-1];
			}
			for(int i=1;i<m+1;i++) {
				height[i] = sc.nextInt() + height[i-1];
			}
			
			
			for(int w0 = 0; w0 < n; w0++) {
				for(int w1 = w0+1; w1 < n+1; w1++) {
					
					for(int h0 = 0; h0 < m; h0++) {
						for(int h1 = h0+1; h1< m+1; h1++) {
							
							if(width[w1]-width[w0] == height[h1]-height[h0]) {
								counter++;
								break;
							}
							if(width[w1]-width[w0] < height[h1]-height[h0]) {
								break;
							}
							
						}
					}
					
					
				}
			}
			System.out.println(counter);
		}
		sc.close();
	}

}

