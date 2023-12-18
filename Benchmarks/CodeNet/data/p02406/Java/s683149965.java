import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int n, i;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        i = 1;
        CHECK_NUM(i);
	}

	public static void CHECK_NUM(int x){
		  if ( x % 3 == 0 ){
		    System.out.print(" " + i);
		    END_CHECK_NUM(i);
		  }
		  INCLUDE_3(i);
	}

	private static void INCLUDE_3(int x) {
		if ( x % 10 == 3 ){
			System.out.print(" " + i);
		    END_CHECK_NUM(i);
		  }
		  x /= 10;
		  if ( x != 0) INCLUDE_3(x);
		  END_CHECK_NUM(i);
	}

	private static void END_CHECK_NUM(int x){
		i = x;
		  if ( ++i <= n ) {
			  CHECK_NUM(i);
		  }else{
			  System.exit(0);
		  }
	}
}