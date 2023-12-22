import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		int n=s.length()-1;
		long sum=0;
		for(int i=0;i<Math.pow(2, n);i++) {
			int[] status = new int[n];
			int b=0;
			for(int j=0;j<n;j++) {//iを2進数にした場合にどこの桁が1になっているか判定し、1の場合はstatusに代入
				if((1&i>>j)==1) {
					status[j]=1;
				}
			}
			for(int j=0;j<n;j++) {
				if(status[j]==1) {
					sum+=Long.valueOf(s.substring(b, j+1));
					//System.out.println(s.substring(b, j+1));
					b=j+1;
				}
			}
			sum+=Long.valueOf(s.substring(b, n+1));
			//System.out.println("last:"+s.substring(b, n+1));
		}
		System.out.println(sum);

	}
}

