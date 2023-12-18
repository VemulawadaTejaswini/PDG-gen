import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String str = sc.nextLine(),temp;
		int swaps = 0;
		String[] A = str.split(" ");
		for(int i=0; i<=A.length-1; i++) {
			for(int j=A.length-1; j>=i+1; j--) {
				if(Integer.valueOf(A[j]) < Integer.valueOf(A[j-1])) {
					temp = A[j];
					A[j]=A[j-1];
					A[j-1]=temp;
					swaps++;
				}
			}
		}
		for(int i=0;i<A.length-1;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println(A[A.length-1]+"\n"+swaps);
	}

}

