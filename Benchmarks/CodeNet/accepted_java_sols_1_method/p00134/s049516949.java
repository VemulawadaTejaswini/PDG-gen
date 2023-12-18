import java.util.*;
import java.math.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n == 0) break;
	    BigInteger s = new BigInteger("0");
	    for(int i = 0; i < n; i++) s = s.add(new BigInteger(sc.next()));

	    System.out.println(s.divide(new BigInteger(Integer.toString(n))).toString());
	}
    }

    public static void main(String[] args){
	new Main();
    }
}