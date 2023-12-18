import java.math.*;
import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int d = in.nextInt();
			int ret = 0;
			for(int i=d; i<=600-d; i += d){
				ret += sq(i);
			}
			System.out.println(ret*d);
		}
	}

	private static int sq(int x){
		return x*x;
	}

}