import java.util.Scanner;
 
public class Main {
  public static void main ( String[] args ) {

    Scanner sc = new Scanner ( System.in ); 

    int A = sc.nextInt();
    int B = sc.nextInt(); 
    int C = sc.nextInt(); 
	int Z = 0;
		
		if (A-B >= C ) {
			Z = 0;
		} else {
			Z = C - (A-B);
		}
      
		System.out.println(Z);
    
  }
}