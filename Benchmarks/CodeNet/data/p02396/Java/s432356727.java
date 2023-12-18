import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int cnt=0,in;
		while(true) {
			cnt++;
			in = Integer.parseInt(s.next());
			if(in==0)
				return;
			System.out.printf("Case %d: %d\n",cnt,in);
		}
	}
}