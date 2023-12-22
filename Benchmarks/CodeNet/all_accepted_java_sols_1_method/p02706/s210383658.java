
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[M];
        int sumA=0;
        
        for(int i=0;i<M;i++) {
        	A[i] = sc.nextInt();
        }
        
        for(int i=0;i<M;i++) {
        	sumA += A[i];
        }
        
        int daysForPlay = N - sumA;
        if(daysForPlay<0) {
        	System.out.println(-1);
        }else {
        	System.out.println(daysForPlay);
        }
        
        }
	}

