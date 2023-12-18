import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		long[] a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}

		for(int i = 0; i < Q; i++) {
			long que=sc.nextLong();
			long cnt = 0;
			long sum = 0;
			int right = 0;
			for(int left = 0; left < N; left++) {
				while(right < N && sum + a[right] <= que) {
					sum += a[right];
					right++;
				}
				cnt += (right - left);
				//System.out.println("†"+(right-left)+" "+(right+" "+left));
				if(left == right) {
					right++;
				}else {
					sum -= a[left];
				}
			}
			System.out.println(cnt);
		}
	}
}


/*
class dsl3c{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		long[] wa=new long[N+1];
		for(int i=1; i<=N; i++) {
			wa[i]=sc.nextInt();
		}
		wa[0]=0;
		for(int i=1; i<=N; i++) {
			wa[i]=wa[i]+wa[i-1];		//累積和
		}
		for(int jj=0; jj<Q; jj++) {
			long sum=sc.nextLong();

			long kotae=0;
			int right=1;

			for(int left=0; left<N; left++) {
				if(left>right) {
					right=left;
				}
				while(wa[right]-wa[left]>=sum) {
					right++;
				}
				kotae+=right-right+1;
			}
			System.out.println(kotae);
		}
	}
}

*/

/*

import java.util.Scanner;

class dsl3c{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		long[] wa=new long[N+1];
		for(int i=1; i<=N; i++) {
			wa[i]=sc.nextInt();
		}
		wa[0]=0;
		for(int i=1; i<=N; i++) {
			wa[i]=wa[i]+wa[i-1];		//累積和
		}
		for(int jj=0; jj<Q; jj++) {
			long sum=sc.nextLong();

			long kotae=0;

			for(int i=0; i<N; i++) {		//いちばんひだり
				int counter=0;
				while(true) {
					if(i+counter>N) {
						kotae+=counter-1;
						break;
					}
					else {
						if(wa[i+counter]-wa[i]<=sum) {
							counter++;
						}
						else if(wa[i+counter]-wa[i]>=sum) {
							if(wa[i+counter]-wa[i]>=sum) {
								kotae+=(counter-1);
								break;
							}
							else {
								kotae+=(counter-2);
								break;
							}
						}
					}
				}
			}
			System.out.println(kotae);
		}
	}
}

O(N^2)解法

*/
