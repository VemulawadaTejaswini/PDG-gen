import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int tem = 0;
		int end = 0;
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		
		while(end == 0) {
			for(int j=0;j<n;j++) {
				if(A[j]%2 == 0) {
					tem+=1;
					A[j]/=2;
				}
				else {
					end+=1;
					break;
				}
			}
		}
		System.out.printf("%d\n",tem/n);
	}
}