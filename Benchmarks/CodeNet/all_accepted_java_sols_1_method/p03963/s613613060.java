


import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int sum=1;
		if(K>1) {
			for(int i=0; i<N-1; i++) {
				sum*=(K-1);
			}
			sum*=K;
		}
		else if(K==1) {
			sum=1;
		}

		System.out.println(sum);
	}
}