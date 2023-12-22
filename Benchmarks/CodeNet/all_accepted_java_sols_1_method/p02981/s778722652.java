import java.util.Scanner;


public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);

	int N = std.nextInt();
	//List<Integer> list = new ArrayList<>();
	//List<List<Integer>> list = new ArrayList<>();
	int A = std.nextInt();
	int B = std.nextInt();
	//int C = std.nextInt();
	//int temp = 0;

	if(N*A >= B) {
		System.out.println(B);
	}

	else {
		System.out.println(N*A);
	}



	}



}
