import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N= sc.nextInt();
		long /*A[] = new long[N],*/ans=0;;
		for(int i=0;i<N;i++) {
			if(ans<0) {
				ans=-1;
				break;
			}
			ans*=sc.nextLong();
		}
		System.out.println(ans);
	}
}