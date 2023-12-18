import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long ans = 0;
		ans=(N/(A+B))*A;
		if (A<=(N%(A+B))){
			ans=ans+A;
		}
		else{
		ans=ans+(N%(A+B));
		}
		System.out.println(ans);
    }
}