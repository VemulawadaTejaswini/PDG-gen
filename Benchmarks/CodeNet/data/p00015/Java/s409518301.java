import java.util.Scanner;
import java.math.BigInteger;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int times = stdin.nextInt();
	for(int i = 0; i < times; i++){
	    BigInteger a = new BigInteger(stdin.next());
	    BigInteger b = new BigInteger(stdin.next()).add(a);
	    if(b.compareTo(BigInteger.TEN.pow(79)) >= 0){
		System.out.println("overflow");
	    } else {
		System.out.println(b);
	    }
	}
    }
}