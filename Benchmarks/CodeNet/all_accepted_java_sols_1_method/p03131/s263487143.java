import java.util.Scanner;

public class Main {
	//static final int size = 1000000003;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
//		long[] bis = new long[size];
//		for(int i = 0; i<size; i++)bis[i]=0;
		long now=1;
		long next=0;
		long future=0;
		long exchange = B-A;
//		bis[0]=1;
		//int yen = 0;
		for(int i = 0; i<K; i++) {
//			bis[i+1]=Math.max(bis[i+1],bis[i]+1);
//			if(bis[i]>=A)bis[i+2]=Math.max(bis[i+2],bis[i]+exchange);

			next = Math.max(next,now+1);
			if(now>=A)future = Math.max(future, now+exchange);

			now = next;
			next = future;
			future = 0;

		}
		System.out.println(now);
	}

}
