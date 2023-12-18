import java.util.*;
public class Main { 
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		makeList();
		while(true) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			if(a == 0 && b == 0 && c == 0) break;
			double cs = (double)b/(double)c;
			int max = 0;
			int ma = 0;
			int mb = 0;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i)> a) break;
				for(int j = 0; j < list.size(); j++) {
					int as = list.get(i);
					int bs = list.get(j);
					if(as * bs > a) break;
					double xs = (double)as/(double)bs;
					if(cs <= xs && xs <= 1 && as * bs > max) {
						max = as*bs;
						ma = as;
						mb = bs;
					}
				}
			}
			System.out.println(ma + " " + mb);
		}
	}
	static void makeList() {
		boolean[] isPrime = new boolean[1000000];
		Arrays.fill(isPrime, true);
		for(int i = 2; i < 100000; i++) {
			if(isPrime[i]) {
				for(int j = i + i; j < 1000000; j += i) {
					isPrime[j] = false;
				}
				list.add(i);
			}
		}
	}
}

	