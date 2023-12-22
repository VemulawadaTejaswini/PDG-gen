import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,max=0,mi=0;
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int [N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<K;i++) {
			for(int j=0;j<N;j++) {
				if(max<a[j]) {
					max=a[j];
					mi=j;
				}
			}
			sum += max;
			max=0;
			a[mi]=0;
		}
		System.out.print(sum);
		sc.close();
	}
}