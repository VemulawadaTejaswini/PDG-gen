
import java.util.Scanner;

public class Main {
	
	static int M = 1046527; 
	static int L = 14;
	static char[][] H = new char[M][L];
	
	static int getChar(char ch) {
		if (ch == 'A') return 1;
		else if (ch == 'C') return 2;
		else if (ch == 'G') return 3;
		else if (ch == 'T') return 4;
		else return 0;
	}
	
	static long getKey(char[] str) {
		long sum=0, p=1;
		for (int i=0; i< str.length; i++) {
			sum += p*(getChar(str[i]));
			p *= 5;
		}
		return sum;
	}
	
	static int h1(int key) {
		return key % M;
	}
	static int h2(int key) {
		return 1 + (key % (M-1));
	}
	
	static int insert(char str[]) {
		int key, h;
		key = (int)getKey(str);
		for (int i=0; ; i++) {
			h = (h1(key) + i*h2(key)) % M;
			if (new String(H[h]).equals(new String(str))) return 1;
			else if (H[h][0] == 0) {
				H[h] = str;
				return 0;
			}
		}
	}
	
	static int find(char[] str) {
		int key, h;
		key = (int)getKey(str);
		for (int i=0; ; i++) {
			h = (h1(key) + i*h2(key)) % M;
			if (new String(H[h]).equals(new String(str))) return 1;
			else if (H[h][0] == 0) return 0;
		}
	}
	
	public static void main(String[] args) {
		int i, n;
		char[] str = new char[L];
		char[] com = new char[9];
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i=0; i<n; i++) {
			com = sc.next().toCharArray();
			str = sc.next().toCharArray();
			
			if (com[0] == 'i') {
				insert(str);
			} else {
				if (find(str)==1) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
		sc.close();
	}
}

