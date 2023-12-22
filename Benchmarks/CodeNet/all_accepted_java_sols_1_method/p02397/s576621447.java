import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int in1,in2;
		while(true) {
			in1 = Integer.parseInt(s.next());
			in2 = Integer.parseInt(s.next());
			if((in1|in2)==0)
				return;
			if(in1<=in2)
				System.out.printf("%d %d\n",in1,in2);
			else
				System.out.printf("%d %d\n",in2,in1);
		}
	}
}