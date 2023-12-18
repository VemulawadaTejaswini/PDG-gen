import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int A = Integer.valueOf(s.next());
		int B = Integer.valueOf(s.next());
		int C = Integer.valueOf(s.next());
		int K = Integer.valueOf(s.next());

		while(K > 0) {
			if(B <= A) {
				B *= 2;
			}else if(C <= B) {
				C *= 2;
			}
			
			if(B > A && C > B) {
				System.out.println("Yes");
				return;
				
			}
			K--;
		}
		System.out.println("No");
	}
}