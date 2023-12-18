import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int n[] = new int[N];

		for(int i =0;i<N;i++) {
			n[i] = sc.nextInt();
		}

		for(int i = N-1;i > 0;i--) {
			for(int j = 0;j<i;j++) {
				if(n[j]<n[j+1]) {
					int cmp = n[j];
					n[j]= n[j+1];
					n[j+1]=cmp;
				}
			}
		}
		
		int count = 0;
		for(int i = 0;i<N-1;i++) {
			count = count+n[i];
		}
		System.out.println(count);

	}
}
