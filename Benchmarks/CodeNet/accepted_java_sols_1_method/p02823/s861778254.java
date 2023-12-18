import java.util.*;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long ans = 0;
		if ((B-A)%2 == 0) {
			ans = (B-A)/2;
		} else {
			ans = Math.min(A-1,N-B)+(Math.abs(A-B)+1)/2;
		}
		System.out.println(ans);
	}
}