import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[6];
		
		loop : while (true) {
			for (int i=0;i<num.length;++i) {
				num[i] = Integer.parseInt(sc.next());
			}
			if (max(num)!=0) {
				System.out.println(""+lcm(calc(num)));
			} else {
				break loop;
			}
		}
	}
	
	private static int[] calc (int... num) {
		int[] no = new int[(int)num.length/2];
		for (int i=0;i<num.length;i+=2) {
			int val = 1, a = i, m = i+1, count=0;
			do {
				val = (num[a]*val)%num[m];
				++count;
			} while (val != 1);
			no[i/2] = count;
		}
		return no;
	}
	
	private static int lcm (int... num) {
		int max = max(num);
		for (int i=2;i<=max;++i) {
			int[] no = mod0(i, num.clone());
			if (no!=null) {
				return i*lcm(no);
			}
		}
		int sum = 1;
		for (int n : num) {
			sum *= n;
		}
		return sum;
	}
	
	private static int[] mod0 (int n, int... num) {
		boolean flag = true;
		for (int i=0;i<num.length;++i) {
			if (num[i]%n!=0) {
				if (flag) {
					flag = false;
				} else {
					return null;
				}
			} else {
				num[i]/=n;
			}
		}
		return num;
	}
	
	private static int max (int... num) {
		int max = 0;
		for (int n : num) {
			if (max < n) {
				max = n;
			}
		}
		return max;
	}
	
}