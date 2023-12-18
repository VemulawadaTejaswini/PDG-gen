import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());

		int ret = 0;
		if(N < 600) {
			ret = 8;
		}else if(N < 800) {
			ret = 7;
		}else if(N < 1000) {
			ret = 6;
		}else if(N < 1200) {
			ret = 5;
		}else if(N < 1400) {
			ret = 4;
		}else if(N < 1600) {
			ret = 3;
		}else if(N < 1800) {
			ret = 2;
		}else if(N < 2000) {
			ret = 1;
		}
		
		System.out.println(ret);
	}
	}
}