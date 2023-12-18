import java.math.BigInteger;
import java.util.Scanner;


public class Main {
	void run(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = a.add(b);
			if(c.toString().length() > 80){
				System.out.println("overflow");
			}
			else{
				System.out.println(c);
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();	
	}
}