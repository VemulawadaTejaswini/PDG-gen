import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long ans = 0;
		ans += ((b+1)/2-a/2)%2;
		int i = 1;
		while((b>>i)!=0) {
			long num = 1L<<(i+1);
			long a_mod = a%num;
			long b_mod = b%num;
			long start = Math.min(num-a_mod, num>>1);
			long end = Math.max(0, b_mod-(num>>1)+1);
			ans += (start+end)%2==1 ? num>>1 : 0;
			i++;
		}
		System.out.print(ans);
		in.close();
	}

}
