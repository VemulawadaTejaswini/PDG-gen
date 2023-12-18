import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long ansB = B / C ;
		long ansA = A / C ;
		long ans = ansB - ansA;
	  if(A % C == 0){
			ans += 1;
		}
		System.out.println(ans);
	}
}
