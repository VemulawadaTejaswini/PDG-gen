import java.util.Scanner;

public class Main {
	long c[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int beforeOne=0,afterOne=0;
		for(int i=0;i<N;i++) {
			int a=sc.nextInt();
			if (a==1) {
				beforeOne = i;
				afterOne = N-(i+1);
				break;
			}
		}
		int count=0;
		if (beforeOne<K||afterOne<K) {
			count +=(N-K)/(K-1)+1;
			if ((N-K)%(K-1)!=0) {
				count ++;
			}
		} else {
			count = 1000000;
			for (int i=0;i<K;i++) {
				int temp = (beforeOne-i)/(K-1);
				if ((beforeOne-i)%(K-1)>0) {
					temp++;
				}
				temp +=(afterOne-(K-i-1))/(K-1);
				if ((afterOne-(K-i-1))%(K-1)>0) {
					temp++;
				}
				temp++;
				if (temp<count) {
					count =temp;
				}

			}
		}

		System.out.println(count);
 	}
}