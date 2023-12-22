import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
	  int[] hoge = new int[N];
	  int max = 0;
	  int sum = 0;
	  for( int i = 0; i < N; i++  ) {
		 hoge[i] = scan.nextInt();
	  }

	  for( int i = 0; i < N; i++  ) {
		 sum += hoge[i];
	  }
	  for( int i = 0; i < N; i++  ) {
		 if( max < hoge[i] ) {
			 max = hoge[i];
		 }
	  }

	  if( max < sum - max ) {
		  System.out.println("Yes");
	  }else {
		  System.out.println("No");
	  }
  }
}
