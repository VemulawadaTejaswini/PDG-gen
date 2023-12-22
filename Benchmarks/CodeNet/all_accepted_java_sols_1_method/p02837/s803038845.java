import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m,max=Integer.MIN_VALUE,count=0;
		int[][] ans=new int[15][15];//入力を15*15の2次元配列で受け取る。ans[i]にはi番目の人の15人に対する意見が格納される。
		boolean flag=true;
		for(int[]buff:ans) {
			Arrays.fill(buff, -1);//ansの初期値を全て-1にする
		}

		/*入力受け取り*/
		for(int i=0;i<n;i++) {
			m=sc.nextInt();//i番目の人の意見の数
			for(int j=0;j<m;j++) {
				ans[i][sc.nextInt()-1]=sc.nextInt();//xをans[i][x-1]とすることで、i番目の人のxに対する意見yをans[i][x]に格納できる。
			}
		}
		/*bit演算*/
		for(int i=0;i<Math.pow(2, n);i++) {
			int[] status = new int[n];
			for(int j=0;j<n;j++) {//iを2進数にした場合にどこの桁が1になっているか判定し、1の場合はstatusに代入
				if((1&i>>j)==1) {
					status[j]=1;//statusが1である==正直者である==status[i]が1だった場合、i番目の人の意見は全て正しくないと行けない。
					count++;
				}
			}
			for(int j=0;j<n;j++) {
				if(status[j]==1) {
					for(int k=0;k<n;k++) {
						if(ans[j][k]==-1)continue;//kの人に対して発言していない。
						if(ans[j][k]!=status[k])flag=false;
					}
				}
			}
			if(flag)max=Math.max(max, count);
			flag=true;
			count=0;
		}
		System.out.println(max);


	}

}

