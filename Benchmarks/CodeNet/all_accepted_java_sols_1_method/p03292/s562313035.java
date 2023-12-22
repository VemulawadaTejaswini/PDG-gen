import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
		for(int i=0;i<=2;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			for(int j=2;j>i;j--) {
				if(A[i]>A[j]) {
					int temp=A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		System.out.println((A[2]-A[1])+(A[1]-A[0]));
	}
}
