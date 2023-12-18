import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] A = new int[n];
			for(int i=0; i<n;i++) {
				A[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			for(int i=0; i<q;i++) {
				int com = sc.nextInt();
				int b = sc.nextInt();
				int e = sc.nextInt();
				int result = A[b];
				switch(com) {
				case 0:
					for(int j=b+1;j<e;j++) {
						result = Math.min(result,A[j]);
					}
					break;
				case 1:
					for(int j=b+1;j<e;j++) {
						result = Math.max(result,A[j]);
					}
					break;
				}
				System.out.println(result);
			}
		}
	}
}
