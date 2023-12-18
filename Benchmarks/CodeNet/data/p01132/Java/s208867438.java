import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean firstFlg = true;

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			if(!firstFlg) System.out.println();
			if(firstFlg) firstFlg = false;

			int before = 0;
			int[] m = new int[4];
			for(int i=0;i<4;i++){
				m[i] = sc.nextInt();
				before += m[i];
			}

			int min = Integer.MAX_VALUE;
			int[] minPay = new int[4];

			for(int i=0;i<=m[0];i++){
				for(int j=0;j<=m[1];j++){
					for(int k=0;k<=m[2];k++){
						for(int l=0;l<=m[3];l++){
							int ex = exchange(n,i,j,k,l);
							if(ex == Integer.MAX_VALUE) continue;

							int after = before - (i+j+k+l) + ex;
							if(after < min){
								minPay[0] = i;
								minPay[1] = j;
								minPay[2] = k;
								minPay[3] = l;
							}
						}
					}
				}
			}

			if(minPay[0]!=0) System.out.println("10 " + minPay[0]);
			if(minPay[1]!=0) System.out.println("50 " + minPay[1]);
			if(minPay[2]!=0) System.out.println("100 " + minPay[2]);
			if(minPay[3]!=0) System.out.println("500 " + minPay[3]);
		}
	}

	private static int exchange(int n,int i,int j,int k,int l){
		int ex = n - i*10 - j*50 - k*100 - l*500;
		if(ex > 0) return Integer.MAX_VALUE;

		ex = -ex;

		int res = 0;
		int tmp;

		if((tmp=ex/500) > 0 && l > 0) return Integer.MAX_VALUE;
		res += tmp;
		if((tmp=ex%500/100) > 0 && k > 0) return Integer.MAX_VALUE;
		res += tmp;
		if((tmp=ex%100/50) > 0 && j > 0) return Integer.MAX_VALUE;
		res += tmp;
		if((tmp=ex%50/10) > 0 && i > 0) return Integer.MAX_VALUE;
		res += tmp;

		return res;
	}
}