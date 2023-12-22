import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

	    int oddcnt = N-N/2;

	    double prob = (double)oddcnt/(double)N;

	    System.out.println(prob);

	}
}

