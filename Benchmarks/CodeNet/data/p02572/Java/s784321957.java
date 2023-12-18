import java.util.Scanner;
class test11 {
public static void main (String[] args) { 
	Scanner in = new Scanner(System.in);
	
        int N =0;
        N = in.nextInt(); 
	int A[] = new int[N];
	int sum =(N*(N+1)*((3*N)+2)*(N-1))/24;
	System.out.print(sum); 

	} 
}