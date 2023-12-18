
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	class com implements Comparable<com> {
		int t;
		int s;
		int d;

		public int compareTo(com tar) {
			return t - tar.t;
		}
		com(int t ,int s , int d){
			this.t = t;
			this.s = s;
			this.d = d;
		}
	}

	public void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 ){
				break;
			}
			TreeSet<Integer> hl = new TreeSet<Integer>();
			com[] arr = new com[m];
			for(int i = 0; i < m ; i ++){
				com a = new com(sc.nextInt(),sc.nextInt(),sc.nextInt());
				arr[i] = a;
			}
			
			Arrays.sort(arr);
			hl.add(1);
			
			for(com c : arr){
				int s = c.s;
				int d = c.d;
				if(hl.contains(s)){
					hl.add(d);
				}
			}
			System.out.println(hl.size());
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}