import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long l0=2;
		long l1=1;

		for(int i=0;i<n-1;i++){
			long buf=l1;
			l1=l1+l0;
			l0=buf;
		}
		System.out.println(l1);

	}
}