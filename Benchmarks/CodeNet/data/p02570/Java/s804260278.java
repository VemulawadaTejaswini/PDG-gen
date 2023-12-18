
import java.util.Scanner;
class Main {
public static void main (String[] args) { 
	Scanner in = new Scanner(System.in);
	     int N = in.nextInt(); 
	int A[] = new int[N]; 
        for (int i = 0; i < N; i++) {
        A[i] = in.nextInt();
    }
	int sum =(N*(N+1)*((3*N)+2)*(N-1))/24;
	System.out.print(sum); 
 
	} 
}