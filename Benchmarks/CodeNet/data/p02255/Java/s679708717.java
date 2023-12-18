import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		System.out.print(A[0] = scan.nextInt());
		for(int i = 1; i < N; i++){
			System.out.print(" " + (A[i] = scan.nextInt()));
		}System.out.println();
		for(int i = 1; i < N; i++){
			int key = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] > key){
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = key;
			System.out.print(A[0]);
			for(int k = 1; k < N; k++){
				System.out.print(" " + A[k]);
			}System.out.println();
		}
	}
}