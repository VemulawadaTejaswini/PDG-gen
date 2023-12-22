import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	Scanner tc = new Scanner (System.in);
	int N, S=0;
	N= tc.nextInt();
	if(N>=3&& N<=100) {
		S= (N-2)*180;
		System.out.println(S);
	}
	
}
}
