import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		long N = Long.valueOf(s.next());
		
		char[] ret;
		
		int keta = 0;
		long now = 1;
		while(true) {
			now *= 26;
			keta++;
			if(N <= now) {
				ret = new char[keta];
				N--;
				for(int i = 0; i < keta; i++) {
					ret[keta-i-1] = (char)(N%26 + 'a');
					N /= 26;
				}
				break;
			}else {
				N -= now;
			}
		}
		System.out.println(new String(ret));
	}
}