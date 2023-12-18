import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int c = n/4;
			int s = 0;
			for(int i=0;i<c;i++){
				s += stdIn.nextInt();
			}
			System.out.println(s);
		}
	}
}