import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		int[][] q = new int[M][2];
		for (int i=0;i<M;i++) {
			q[i][0]=sc.nextInt();
			q[i][1]=sc.nextInt();
		}
		boolean flag = true;
		for (int i=0;i<M;i++) {
			if (N!=1&&q[i][0]==1&&q[i][1]==0) {
				flag = false;
			}
		}
		
		for (int i=0;i<M-1;i++) {
			for (int j=i+1;j<M;j++) {
				if(q[i][0]==q[j][0] && q[i][1]!=q[j][1]) {
					flag = false;
				}
				if(q[i][0]==q[j][0] && q[i][1]==q[j][1]) {
					q[j][0]=0;
				}
			}
		}
		int ans= 0;
		if(flag) {
			for (int i=0;i<M;i++) {
				if (q[i][0]!=0) {
					ans+= q[i][1]*(int)Math.pow(10, N-q[i][0]);
				}
			}
			if(N==3&& ans<100) {
				ans+=100;
			}else if(N==2&& ans<10){
				ans+=10;
			}
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}
		
	}

}