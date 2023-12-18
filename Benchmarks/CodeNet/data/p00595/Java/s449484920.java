import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ1009().doIt();
	}

	class AOJ1009{
		void doIt(){
			while(in.hasNext()){
				System.out.println(gcd(in.nextInt(), in.nextInt()));
			}
		}
		int gcd(int a,int b){
			return b==0? a: gcd(b, a%b);
		}
	}
}