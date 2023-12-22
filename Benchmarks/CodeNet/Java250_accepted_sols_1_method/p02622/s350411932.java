import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		char[] S = s.next().toCharArray();
		char[] T = s.next().toCharArray();
		
		int ret = 0;
		for(int i = 0; i < S.length; i++) {
			if(S[i] != T[i]) {
				ret++;
			}
		}
		System.out.println(ret);
	}
}