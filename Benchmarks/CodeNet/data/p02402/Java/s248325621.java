import java.util.ArrayList;
import java.util.Scanner;

class Main {
	static int d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ary = new ArrayList<Integer>();
		int x,count;
        count = sc.nextInt();
		for(int i =0; i<count; i++) {
			x = sc.nextInt();
			ary.add(x);
		}

        long max = ary.get(0);
		long min = ary.get(0);
		long sum = 0;

		for (int i = 0; i < ary.size(); i++) {
		    int v = ary.get(i);
		    sum += ary.get(i);
		    if (v > max) {
		        max = v;
		    }
		    if (v < min) {
		        min = v;
		    }
		}
		System.out.println(min +" "+max+" "+sum);

	}
}
