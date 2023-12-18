import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			if((a|b|c)==0){
				return;
			}
			double t = Math.sqrt(a*a+b*b);
			t = Math.min(t, Math.sqrt(b*b+c*c));
			t = Math.min(t, Math.sqrt(a*a+c*c));
			int n = stdIn.nextInt();
			for(int i=0;i<n;i++){
				int ana = stdIn.nextInt();
				if(ana*2>t){
					System.out.println("OK");
				}
				else{
					System.out.println("NA");
				}
			}
		}
	}
}