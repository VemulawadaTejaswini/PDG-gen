import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] a=new String[200];
		int num=0;
		while(sc.hasNext()) {
			a[num]=sc.nextLine();
			/*if(a[num].equals("0")) {
				break;
			}*/
			num++;
		}
		String[] ama;
		int sq=(num+1)/2;
		int[][] square=new int[num][sq];
		int[][] dp=new int[num][sq];
		for(int i=0; i<num; i++) {
			ama=a[i].split(",");
			for(int j=0; j<sq; j++) {
				if(j<ama.length) {
					square[i][j]=Integer.parseInt(ama[j]);
				}
				else {
					square[i][j]=0;
				}
				dp[i][j]=0;
			}
		}
		dp[0][0]=square[0][0];

		int counter=1;
		for(int i=1; i<num; i++) {
			if(i<sq) {
				counter=i+1;
				for(int j=0; j<counter; j++) {
					if(j==0) {
						dp[i][j]=dp[i-1][0]+square[i][0];
					}
					else if(counter>=3 && j>=1 && j<=counter-2) {
						dp[i][j]=Math.max(dp[i-1][j-1]+square[i][j], dp[i-1][j]+square[i][j]);
					}
					if(j==counter-1) {
						dp[i][j]=dp[i-1][j-1]+square[i][j];
					}
				}
			}
			else {
				counter=2*sq-1-i;
				for(int j=0; j<counter; j++) {
					dp[i][j]=Math.max(dp[i-1][j]+square[i][j], dp[i-1][j+1]+square[i][j]);
				}
			}
		}
		pl(dp[num-1][0]);
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}

