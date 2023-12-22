import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//List<Integer> list = new ArrayList<>();
	//int N = std.nextInt();
	//int K = std.nextInt();
	String S = std.next();

	if(S.charAt(0) == S.charAt(1) || S.charAt(1) == S.charAt(2) || S.charAt(2) == S.charAt(3)) {
		System.out.println("Bad");
	}

	else {
	System.out.println("Good");
	}

	  }


	}


