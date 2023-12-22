import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		ArrayList<Integer> c = sosu(200);
		for(int i = 1; i < a+1; i++) {
			for(int j = 1; j < a+1; j++) {
				for(int k = 1; k < a+1;k++) {
					b += gcd(i,j,k,c);
				}
			}
		}
		System.out.println(b);
	}
	static int gcd(int a,int b,int c,ArrayList s) {
		int d = 1;
		for(int i = 1; i < s.size(); i++) {
			int ss = (int)s.get(i);
			if(ss != 0) {
				if(a%ss == 0 && b%ss == 0 && c%ss == 0) {
					while(true) {
						d *= ss;
						a /= ss;
						b /= ss;
						c /= ss;
						if(!(a%ss == 0 && b%ss == 0 && c%ss == 0)) break;
					}
				}
			}
		}
		return d;
	}
	static ArrayList sosu(int a) {
		int[] b = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = i+1;
		}
		for(int i = 1; i < a; i++) {
			if(b[i] != 0) {
				for(int j = 0;j < a; j++) {
					if(i != j && b[j] % b[i] == 0)b[j] =0;
				}
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < a; i++) {
			if(b[i] != 0) {
				al.add(b[i]);
			}
		}
		return al;
	}
}
