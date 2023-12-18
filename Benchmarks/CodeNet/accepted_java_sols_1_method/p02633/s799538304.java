import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
				Scanner s = new Scanner(System.in);
		int X = Integer.valueOf(s.next());
		
		int angle = X;
		int ret = 1;
		while(true) {
			if(angle % 360 == 0) {
				System.out.println(ret);
				return;
			}
			ret++;
			angle += X;
		}
	}
}