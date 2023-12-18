
import java.util.Scanner;
public class Main {
	
	public static void insertionSort(int[] A,int N) {
		
		for(int i=1;i<=N-1;i++) {
			int v = A[i];
			int j = i - 1;
			
			while(j >= 0 && A[j] > v) {
				A[j+1] = A[j];
				j--;
				A[j+1] = v;
			}
			
			int count = 0;
			for(int k : A) {
			System.out.print(k);
				if(count != N-1) {
					System.out.print(" ");
				}
				count++;
			}
			System.out.println();
		}
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	
    	int card[] = new int[N];
    	
    	for(int i=0;i<N;i++) 
    		card[i] = sc.nextInt();
    	
    	int count = 0;
    	for(int k : card) {
    			System.out.print(k);
    		if(count != N-1) {
    			System.out.print(" ");
    		}
    		count++;
    	}
    	System.out.println();
    	insertionSort(card,N);
    	
    }
}
