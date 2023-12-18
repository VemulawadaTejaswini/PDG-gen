import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n,x;
		int y[][] = new int[50][2];
		int i = 0;
		while(true){
			n = stdIn.nextInt();
			x = stdIn.nextInt();
			if ((n==0)&&(x==0)) {
				break;
			} else {
				y[i][0] = n;
				y[i][1] = x;
				i++;
			}
		}
		stdIn.close();
		for(int j=0;j<i; j++) {
			if(y[j][0]*3-3 < y[j][1]) {
				System.out.println("0");
			} else if((y[j][0] !=0) && (y[j][1]!=0)) {
				System.out.println(check(y[j][0],y[j][1]));
			}
		}
	}
	static int check(int m,int n){
		int ans=0;
		for(int a=m;a>2;a--) {
			for(int b=m-1;b>1;b--){
				int c = n-a-b;
				if((a!=b) && (c > 1) && (c < m-2) && (a!=c) && (b!=c) ) {
					ans +=1;
				}

			}
		}

		return ans;
	}
}

