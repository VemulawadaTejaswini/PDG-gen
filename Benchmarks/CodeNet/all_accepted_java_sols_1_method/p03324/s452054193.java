import java.util.*;
import java.lang.*;

public class Main {
 public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	int D = sc.nextInt();
	int N = sc.nextInt();
	
	int a = (int)Math.pow(100,D);

  if (N != 100){
	System.out.println( a*N );

  }else{
	System.out.println( a*(N+1) );
  }
 }
}