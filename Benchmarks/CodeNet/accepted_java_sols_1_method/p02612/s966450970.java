import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
				Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		
		N = N % 1000;
		if(N == 0) {
			System.out.println(0);
		}else {
			System.out.println(1000 - N);
		}
	}
}