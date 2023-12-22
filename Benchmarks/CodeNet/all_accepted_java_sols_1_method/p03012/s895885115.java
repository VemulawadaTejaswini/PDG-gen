import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] weight =new int[N];
		int min =Integer.MAX_VALUE;

		for(int i=0;i<N;i++) {
			weight[i]=sc.nextInt();
		}

		for(int i=0;i<N;i++) {
			int sum1=0;
			int sum2=0;
			for(int j=0;j<=i;j++) {
				sum1+=weight[j];
			}
			for(int k=i+1;k<N;k++) {
				sum2+=weight[k];
			}
			int dif = Math.abs(sum1-sum2);
			if(dif<min) {
				min=dif;
			}
		}
		System.out.println(min);
	}
}