import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int n;
	int A[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		A = new int[n];
		for(int i=0; i<n; i++) {
			A[i]=sc.nextInt();
		}

		int ans=0;
		boolean cont=true;
		while(cont) {
			for(int i=0; i<n; i++) {
				if(A[i] % 2 == 0) {
					A[i] = A[i]/2;
				}else {
					cont=false;
					break;
				}
			}
			if(cont)ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}
