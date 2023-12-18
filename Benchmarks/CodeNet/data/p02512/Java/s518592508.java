import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    for(int i = 0; i < n; i++){
		BigInteger s = new BigInteger(sc.next());
		BigInteger t = new BigInteger(sc.next());

		System.out.println((s.add(t)).toString());
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}