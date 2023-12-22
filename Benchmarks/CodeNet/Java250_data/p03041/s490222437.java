import java.util.*;

public class Main {

  public static void main(String args[]) {
    int rep = 1;
    if( args.length > 0 ) { rep = Integer.parseInt(args[0]); }
    (new Main()).__solve(rep);
  }

  void __solve(int rep) {

    try (
      Scanner cin = new Scanner(System.in);
    ) {

      for( int i = 0; i < rep; ++i ) {
        __solve(cin);
      }

    }

  }

  void __solve(Scanner cin) {
	  int N = cin.nextInt();
	  int K = cin.nextInt();
	  String s = cin.next();
	  String ans = "";
	  for( int i = 0; i < N; ++i ) {
		  if( i + 1 == K ) {
			  ans += (char)(s.charAt(i) - 'A' + 'a');
		  }
		  else {
			  ans += s.charAt(i);
		  }
	  }
	  System.out.println(ans);
  }

}
