import java.util.*;
	
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int[] A = new int[a];
		int m =0;
		while (m<a) {
			A[m]= in.nextInt();
			m++;
		}
		for (int i=0;i<a-1;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.print(A[a-1]);
		System.out.println();
		for (int i=1;i<a;i++) {
			int key = A[i];
			int j =i-1;
			while (j>=0 && A[j]>key){
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=key;
			for (int b=0;b<a-1;b++) {
				System.out.print(A[b]+" ");
			}
			System.out.print(A[a-1]);
			System.out.println();
		}
		in.close();
	}
}
