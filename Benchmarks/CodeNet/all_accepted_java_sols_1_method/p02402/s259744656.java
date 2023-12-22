import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		s.next();
		long min = Integer.parseInt(s.next()),
		     max = min,
		     sum = min,
		     in;
		while(s.hasNext()) {
			in = Integer.parseInt(s.next());
			min = Math.min(min, in);
			max = Math.max(max, in);
			sum += in;
		}

		System.out.printf("%d %d %d\n",min,max,sum);
	}
}