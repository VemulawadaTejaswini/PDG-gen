
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int count = 0;
        int sumA = 0;
        for(int i = 0; i < N; i++) {
        	A[i] = sc.nextInt();
        	sumA += A[i];
        }
        sc.close();
        
        
        for(int i = 0; i < N; i++) {
        	if((double)A[i] >= (double)sumA / (4 * M)) {
        		count ++;
        	}
        }
        
        
        if(count >= M)
        System.out.println("Yes");
        else
        System.out.println("No");



        
        }
	}
