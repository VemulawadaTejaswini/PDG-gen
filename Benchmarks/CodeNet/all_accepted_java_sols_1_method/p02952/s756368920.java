import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int counter = 0;
	if(N<10) {counter = N;}
	else if (N <100) {counter = 9;}
	else if (N <1000) {counter = 9+N-100+1;}
	else if (N <10000) {counter = 9+999-100+1;}
	else if (N<100000) {counter = 9+999-100+1+N-10000+1;}
	else {counter = 9+999-100+1+99999-10000+1;}
	
	
	System.out.println(counter);
	}
}
