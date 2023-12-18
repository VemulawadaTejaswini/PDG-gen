import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt(),K=sc.nextInt(),p[]=new int[N];
		for(int i=0;i<N;i++) {
			p[i]=sc.nextInt();
		}
		Arrays.sort(p);
		int sum=0;
		for(int i=0;i<K;i++) {
			sum+=p[i];
		}
		System.out.println(sum);
	}
}