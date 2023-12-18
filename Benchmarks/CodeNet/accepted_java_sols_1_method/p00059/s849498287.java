import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			double xa1 = stdIn.nextDouble();
			double ya1 = stdIn.nextDouble();
			double xa2 = stdIn.nextDouble();
			double ya2 = stdIn.nextDouble();
			double xb1 = stdIn.nextDouble();
			double yb1 = stdIn.nextDouble();
			double xb2 = stdIn.nextDouble();
			double yb2 = stdIn.nextDouble();
			boolean flag = true;
			if(xb2<xa1||xa2<xb1||ya2<yb1||yb2<ya1){
				flag = false;
			}
			System.out.println(flag?"YES":"NO");
		}
	}
}