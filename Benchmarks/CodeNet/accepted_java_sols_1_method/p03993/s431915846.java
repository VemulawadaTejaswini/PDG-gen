import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N+1];
		for(int i=1;i<=N;i++) {
			a[i]= sc.nextInt();
		}
		int count =0;
		for(int i=1;i<=N;i++) {
			if(a[a[i]]==i) {
				count ++;
			}
		}
		System.out.println(count/2);
	}
}