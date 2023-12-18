import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Main {

	public static void main(String args[]) throws IOException{

		BufferedReader br =  new BufferedReader (new InputStreamReader (System.in) );
        int n = Integer.parseInt(br.readLine() );

        System.out.println( Fibonacci( n ) );


	}


	public static int Fibonacci(int n){

		int ans;

		if(n == 0 ){
			ans = 1;
		}
		else if(n == 1 ){
			ans = 1;
		}
		else{

			ans = Fibonacci( n - 1) + Fibonacci( n - 2);
		}
		return ans;

	}

}