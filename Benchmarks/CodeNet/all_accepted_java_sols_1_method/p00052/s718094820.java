import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int sum = 0;
			while(n>0){
				n/=5;
				sum+=n;
			}
			System.out.println(sum);
		}
	}
}