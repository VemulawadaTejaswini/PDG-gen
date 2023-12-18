import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int m = scn.nextInt();
		for(int k=0;k<m;k++){
			int fund = scn.nextInt();
			int year = scn.nextInt();
			int n = scn.nextInt();
			int summax = 0;
			for(int i=0;i<n;i++){
				int sm = scn.nextInt();
				double per = scn.nextDouble();
				int fine = scn.nextInt();
				int crt = fund;
				int outcrt = 0;
				for(int s=0;s<year;s++){
					if(sm==0){//??????
						outcrt+=crt*per;
						crt=crt-fine;
					}else if(sm==1){//??????	
						crt = (int) (crt*per+crt-fine);
					}
				}
				if(crt+outcrt>summax){
					summax=crt+outcrt;
				}
			}
			out.println(summax);
		}
		out.flush();
		
	}

}