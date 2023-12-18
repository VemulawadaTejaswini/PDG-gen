import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int length = scanner.nextInt();
		int A[] = new int[length];
        for(int i = 0; i < length; i++)
        	A[i] = scanner.nextInt();
   
        out_put(A);
		int key=1000;
		for (int j = 1; j < length; j++) {
			key = A[j];
			int l = j - 1;
			while (l >= 0 && A[l] > key) {
				A[l + 1] = A[l];
				l--;
			}
			A[l + 1] = key;
			out_put(A);
		}
		
	}
	private static void out_put(int A[]){
		 
        System.out.printf("%d", A[0]);
 
        for(int i = 1; i < A.length; i++){
            System.out.printf(" %d", A[i]);
        }
        System.out.printf("\n");
    }

}

