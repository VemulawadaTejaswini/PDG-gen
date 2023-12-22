import java.util.* ;

public class Main {

	static Scanner in = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = in.nextInt() ;
		int B = in.nextInt() ;
		double T = in.nextInt() ;
		T += 0.5 ;
		int sum = 0 ;
		while(T >= (A*1.0)){
			sum += B ;
			T -= A ;
		}
		System.out.println(sum);
	}

}
