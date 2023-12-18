import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int X = Integer.valueOf(s.next());
		int T = Integer.valueOf(s.next());
		
		int Time = 0;
		if(N % X == 0) {
			Time = (N / X) *T;
			
		}else {
			Time = (N / X + 1) * T;
		}
		
		System.out.println(Time);
	}
}