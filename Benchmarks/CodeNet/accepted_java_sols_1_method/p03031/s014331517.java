import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[] k=new int[m];
		int[][] s=new int[m][n];
		int[] p=new int[m];
		int[] sum=new int[m];
		int count=0;
		boolean flag=true;

		for(int i=0;i<m;i++) {
			k[i]=sc.nextInt();
			for(int j=0;j<k[i];j++) {
				s[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			p[i]=sc.nextInt();
		}
		for(int i=0;i<Math.pow(2, n);i++) {
			int[] status = new int[n];
			for(int j=0;j<n;j++) {//iを2進数にした場合にどこの桁が1になっているか判定し、1の場合はstatusに代入
				if((1&i>>j)==1) {
					status[j]=1;
				}
			}
			for(int h=0;h<m;h++) {
				for(int j=0;j<k[h];j++) {
					if(status[s[h][j]-1]==1)sum[h]++;
				}
			}
			//System.out.println("stauts"+Arrays.toString(status));
			//System.out.println("sum"+Arrays.toString(sum));
			for(int h=0;h<m;h++) {
				if(p[h]!=sum[h]%2)flag=false;
			}
			if(flag)count++;
			flag=true;
			Arrays.fill(sum, 0);
		}
		System.out.println(count);

	}
}

