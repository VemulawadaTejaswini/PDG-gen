import java.util.Scanner;
 
public class Main {
  public static void main ( String[] args ) {

    Scanner sc = new Scanner ( System.in ); 

    int N = sc.nextInt();

    int[] arrive = new int[N];
    
    for (int i=0;i<N;i++){
    	int number = sc.nextInt();
        arrive[number-1] = i+1;
    }
    
    for (int j=0; j<N; j++){
     	System.out.println(arrive[j]);
 	}
  }
}