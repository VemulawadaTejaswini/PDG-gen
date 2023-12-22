

import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();

		int[] machi=new int[N+1];
		for(int i=0; i<N+1; i++) {
			machi[i]=0;
		}

		int mae=0,ato=0;
		for(int i=0; i<M; i++) {
			mae=sc.nextInt();
			ato=sc.nextInt();
			machi[mae]++;
			machi[ato]++;
		}

		for(int i=1; i<=N; i++) {
			System.out.println(machi[i]);
		}
	}
}