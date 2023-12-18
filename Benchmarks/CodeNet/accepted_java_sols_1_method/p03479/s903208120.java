import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long X = Long.parseLong(in.next());
		long Y = Long.parseLong(in.next());
		int ans = 0;
		while(X<=Y){
			ans++;
			X = X << 1;
		}
		System.out.println(ans);
	}
}