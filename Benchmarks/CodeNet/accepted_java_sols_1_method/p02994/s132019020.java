import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//List<Integer> list = new ArrayList<>();
	int N = std.nextInt();
	int L = std.nextInt();
	int Lsum = 0;
	int Ltemp = L;
	//String S = std.next();

	if(L <= 0 && Math.abs(L) < N) {
		for(int i = 0; i < N; i++) {
			Lsum = Lsum +L;
			L++;
		}
	}


	else if(L <= 0 && Math.abs(L) >= N) {
		for(int i = 0; i < N; i++) {
			Lsum = Lsum + L;
			L++;
		}
		Lsum = Lsum - L + 1;
	}

//-5,-4,-3=-12.
	else {
		for(int i = 0; i < N; i++) {
			Lsum = Lsum + L;
			L++;
		}
		Lsum = Lsum - Ltemp;
	}

	System.out.println(Lsum);


	  }


	}


