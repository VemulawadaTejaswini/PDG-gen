import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String X = sc.next();
		int one = 0;
		for (int i = 0; i < X.length(); i++) {
			if (X.charAt(i) == '1') {
				one++;
			}
		}
		long sum = 0;
		long sum2 = 0;
		long temp = 1;
		long odd[] = new long[N];
		long a[] = new long[N];
		for (int i = 0; i < X.length(); i++) {
			if (one > 1) {
				odd[i] = temp;
				temp = (temp * 2) % (one - 1);
			}
		}
		temp = 1;
		for (int i = 0; i < X.length(); i++) {
			a[i] = temp;
			temp = (temp * 2) % (one + 1);
		}
		for (int i = X.length()-1; i >=0; i--) {
			if (X.charAt(i)=='1') {
				if (one>1) {
					sum =(sum + odd[N-i-1])%(one-1);
				}
				sum2 =(sum2 + a[N-i-1])%(one+1);
			}
		}
		int result[] = new int[N];
		for (int i = X.length()-1; i >=0; i--) {
			if (one==0 &&i!=N-1) {
				result[i]=0;
			} else if (one ==0) {
				result[i]=1;
			} else if (one==1&&X.charAt(i)=='1') {
				result[i]=0;
			} else if (X.charAt(i)=='1'){
				long t = (sum-odd[N-i-1]+one-1)%(one-1);
				result[i]=Main.changeT(t)+1;
			} else {
				long t = (sum2+a[N-i-1])%(one+1);
				result[i]=Main.changeT(t)+1;
			}
		}
		for (int i = 0; i < X.length(); i++) {
			System.out.println(result[i]);
		}
	}

	public static int changeT (long a) {
		int count =0;
		while(a>0) {
			int one=0;
			long temp =a;
			while (temp>0) {
				if (temp%2==1) {
					one ++;
				}
				temp = temp/2;
			}
			a = a%one;
			count ++;
		}
		return count;
	}
}