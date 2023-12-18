import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int ABCD = s.nextInt();
		
		StringBuilder str = new StringBuilder();
		StringBuilder abcd = new StringBuilder(String.format("%04d", ABCD));
		for(int i = 0; i < (1<<3); i++) {
			int candidate = ABCD/1000;
			int tmp = ABCD;
			for(int j = 0; j < 3; j++) {
				if(((i>>j) & 1) == 1) {
					candidate += tmp%10;
					str.insert(0, "+");
				}else {
					candidate -= tmp%10;
					str.insert(0, "-");
				}
				tmp /= 10;
			}
			if(candidate == 7) {
				abcd.insert(1, str.charAt(0));
				abcd.insert(3, str.charAt(1));
				abcd.insert(5, str.charAt(2));
				abcd.append("=7");
				System.out.println(abcd.toString());
				return;
			}
			str = new StringBuilder();
		}
    }
}
