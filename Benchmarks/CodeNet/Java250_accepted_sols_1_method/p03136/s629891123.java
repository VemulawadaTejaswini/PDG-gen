import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i =0; i<N; i++) {
        	A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int e = 0;
        for(int w :A) {
        	e += w;
        }
        if(A[N-1] < (e - A[N-1])) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}