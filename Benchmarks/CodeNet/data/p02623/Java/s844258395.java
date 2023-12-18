import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		for (int i=0; i<m; i++){
			b[i] = sc.nextInt();
		}

		int readA=0;
		long totalA=0;
		int idxA = 0;
		for (int i=0; i<n; i++){
			idxA = i;
			if (totalA + a[i] <= k){
				readA ++;
				totalA += a[i];
			} else {
				break;
			}
		}

		int readB=0;
		long totalB=0;
		long ans = readA;
		while (true){

			for (int i=readB; i<m; i++){
				if (totalA + totalB + b[i] <= k){
					readB++;
					totalB += b[i];
				} else {
					break;
				}
			}

//			System.out.println(totalA);
//			System.out.println(totalB);
//			System.out.println("-------");

			ans = Math.max(ans, readA + readB);

			if (readA > 0){
				totalA-= a[readA-1];
			}
			readA--;

			if (readA < 0){
				break;
			}

		}
		System.out.println(ans);

	}

}