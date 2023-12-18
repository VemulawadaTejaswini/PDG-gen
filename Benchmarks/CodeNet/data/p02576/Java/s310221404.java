import java.util.Scanner;

public class Main {

	public static void main(String[] aggs){

	Scanner stdIn = new Scanner(System.in);
	int N = stdIn.nextInt();
	int X = stdIn.nextInt();
	int T = stdIn.nextInt();

	int i=0;
	int t=0;

	for(i=0;i<N;i=i+X) {
		t=t+T;
	}

	System.out.println(t);

	}
}
