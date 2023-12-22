import java.util.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
    int input[] = new int[N];
    int newput[] = new int[N];
    int a = 0;
    for (int i = 0; i < N ; i++){
    	a = sc.nextInt();
        input[i] = a;
        newput[i] = a;
	}
    Arrays.sort(newput);
    int first = newput[N-1];
    int second = newput[N-2];
    if ( first == second ) {
      for ( int i = 0; i < N ; i++){
      	System.out.println(first);
      }
    }
    else {
 		for ( int i = 0; i < N ; i++){
          if ( input[i] == first ){
            System.out.println(second);
          }
          else {
            System.out.println(first);
          }
      }  
    }
        
    }
}