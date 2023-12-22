import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		char[] a;
		int p;
		int s;
		int t;
		char[] m;
		
		while(n-- != 0){
			a = new char[3000];
			p = 1500;
			s = 1500;
			t = 1500;
			
			m = scan.next().toCharArray();
			a[p] = m[0];
			
			for(int i = 1; i < m.length;i ++){
				if(m[i] == '-')p++;
				else p--;
				i += 2;
				s = Math.min(s, p);
				t = Math.max(t, p);
				a[p] = m[i];
			}
			
			for(int i = s; i <= t; i++){
				System.out.print(a[i]);
			}
			System.out.println();
		}
	}
}