import java.util.Scanner;
class Main {
public static void main (String[] args) { 
	Scanner in = new Scanner(System.in);
	
        int N = in.nextInt(); 
	int A[] = new int[N]; 
        for (int i = 0; i < N; i++) {
        A[i] = in.nextInt();
    }
	int sum=0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
		sum = sum + A[i]*A[j];}} 
        
	System.out.println(sum); 

	} 
} 