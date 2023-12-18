import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int a=Integer.parseInt(s.next()),
		    b=Integer.parseInt(s.next()),
		    c=Integer.parseInt(s.next()),
		    cnt=0;
		for(int i=a;i<=b;i++) {
			if(c%i==0)
				cnt++;
		}
		System.out.println(cnt);
	}
}