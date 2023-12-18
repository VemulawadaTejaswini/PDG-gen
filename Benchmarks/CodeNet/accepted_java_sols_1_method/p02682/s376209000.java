//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		
		if(A>=K) {
			System.out.println(K);
		}
		if(A<K) {
			if((K-A)<=B) {
				System.out.println(A);
			}
			if((K-A)>B) {
				System.out.println(A-(K-(A+B)));
			}
		}
	}
}