import java.util.Scanner;

public class Main {

	public static void main(String[] aggs){

	Scanner stdIn = new Scanner(System.in);
	long N = stdIn.nextInt();

	long i=0;
	long ten=1;
	long x=0;
	long n2=N;

	do {

		ten=ten*10;

	}while(ten<N);
	ten=ten/10;


	while(ten!=1){
		x=x+(N/ten);
		N=N%ten;
		ten=ten/10;
	}

	x=x+N;

	if(x%9==0) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}


	}
}
