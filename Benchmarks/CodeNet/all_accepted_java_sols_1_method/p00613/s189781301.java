import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int k = stdIn.nextInt();
			if(k==0){
				return;
			}
			int s = 0;
			for(int i=0;i<k*(k-1)/2;i++){
				s += stdIn.nextInt();
			}
			System.out.println(s/(k-1));
		}
	}
}