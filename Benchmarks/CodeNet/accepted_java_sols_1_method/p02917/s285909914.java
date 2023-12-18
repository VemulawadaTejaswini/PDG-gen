import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int B[] = new int[N-1];
	
	sc.nextLine();
	for (int i=0; i<N-1; i++){
	  B[i] = sc.nextInt();
	}
	
	long SumA = B[0];
	
    for (int i=1; i<N-1; i++){
	  SumA += Math.min(B[i-1],B[i]);
	}
	
	SumA += B[N-2];
    
    System.out.println(SumA);
  }
}