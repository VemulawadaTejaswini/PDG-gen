import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	int N = sc.nextInt();
	int S = 0;
	
	if(N>=3 && N<=100){
		S = (N - 2)*180;
		System.out.println(S);
	}
	}

}