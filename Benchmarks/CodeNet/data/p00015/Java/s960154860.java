import java.util.Scanner;
import java.math.BigInteger;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int times = stdin.nextInt();
	for(int i = 0; i < times; i++){
	    BigInteger a = new BigInteger(stdin.next());
	    System.out.println(new BigInteger(stdin.next()).add(a));
	}
    }
}