import java.util.*;

public class Main {
	public static void main(String[] args){
		new Main().calc();
	}

	void calc(){
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0) break;
			uni = new int[n];
			int i;
			for(i=0;i<n;i++) uni[i] = -1;
			int m = cin.nextInt();
			int[] a = new int[m];
			int[] b = new int[m];
			int[] d = new int[m];
			long[] sum = new long[m];
			for(i=0;i<m;i++){
				String[] st = cin.next().split(",");
				a[i] = Integer.parseInt(st[0]);
				b[i] = Integer.parseInt(st[1]);
				d[i] = Integer.parseInt(st[2])/100 - 1;
				sum[i] = d[i] * (long)10000 + a[i] * 100 + b[i];
			}
			Arrays.sort(sum);
			int ret = 0;
			for(i=0;i<m;i++){
				a[i] = (int)(sum[i] %100);
				b[i] = (int)((sum[i]/100)%100);
				d[i] = (int)(sum[i]/10000);
				if(getuni(a[i])!=getuni(b[i])){
					ret += d[i];
					connect(a[i],b[i]);
				}
			}
			System.out.println(ret);
		}
	}

	int[] uni;

	int getuni(int a){
		if(uni[a]<0) return a;
		return uni[a] = getuni(uni[a]);
	}
	
	void connect(int a, int b){
		a = getuni(a);
		b = getuni(b);
		uni[a] = b;
	}
}