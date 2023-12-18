import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if (N==1) {
			System.out.println(1);
			return ;
		}
		if (N==2) {
			System.out.println(3);
			return ;
		}
		boolean b = true;
		for (int i=2;i*i<=N;i++) {
			if(N%i==0) {
				b = false;
				break;
			}
		}
		if (b==true) {
			System.out.println(N-1);
			return ;
		}
		long temp = 1;
		for (temp=2; (1+temp)*temp<2*N;temp++) {
			;
		}
		long sum = ((1+temp)*temp)%(2*N);
		long now = temp;
		while (sum!=0) {
			long low = 1 ;
			long high = now;
			while (((1+temp*2+high)*high+sum)<2*N) {
				high *=2;
			}
			long t = high;
			while (low<high) {
				long mid = (low+high)/2;
				if (((1+temp*2+mid)*mid+sum)>=N*2) {
					t = mid;
					high = mid-1;
				} else {
					low = mid+1;
				}
			}
			sum = ((1+temp*2+t)*(t)+sum)%(N*2);
			temp +=t;
			now = t;

		}
		System.out.println(temp);
	}
}