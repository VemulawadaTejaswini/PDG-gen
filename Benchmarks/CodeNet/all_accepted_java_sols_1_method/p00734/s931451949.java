import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				int m=sc.nextInt();
				if(n+m==0) break;
				int[] t=new int[n+1];
				int[] h=new int[m+1];
				int tsum=0, hsum=0;
				for(int i=0; i<n; i++) {
					t[i]=sc.nextInt();
					tsum+=t[i];
				}
				for(int i=0; i<m; i++) {
					h[i]=sc.nextInt();
					hsum+=h[i];
				}
				int tnow=0, hnow=0;
				int change=1000000;
				int imin=0, jmin=0;
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						tnow=tsum-t[i]+h[j];
						hnow=hsum-h[j]+t[i];
						if(tnow==hnow) {
							if(t[i]+h[j]<change) {
								imin=t[i];
								jmin=h[j];
								change=t[i]+h[j];
							}
						}
					}
				}
				if(change==1000000) {
					System.out.println(-1);
				}
				else {
					System.out.println(imin+" "+jmin);
				}
				
				
			}


		}
	}
}
