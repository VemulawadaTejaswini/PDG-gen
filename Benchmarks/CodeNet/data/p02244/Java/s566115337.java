import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
private static int n = s.nextInt();
static int a,b;
static int[] m = new int[8];
static boolean[] col = new boolean[8];
static boolean[] dpos = new boolean[2*8-1];
static boolean[] dneg = new boolean[2*8-1];
public static void main(String[] args) {
	for(int i = 0;i < 8;i++) {
		m[i] = -1;
	}
	for(int i = 0;i < n;i++) {
		a = s.nextInt();
		b = s.nextInt();
		m[a] = b;
		col[b] = dpos[a+b]  = dneg[a - b + 7] = true;
	}
	putQ(0);
}


static void putQ(int i) {
	if(i == 8) {
		print();
		return;
	}

	if(m[i] != -1) putQ(i+1);
	for(int j = 0;j < 8;j++) {
		if(m[i] != -1 || col[j] || dpos[i+j] || dneg[i - j + 7]) continue;

		m[i] = j;
		col[j] = dpos[i+j] = dneg[i - j + 7] = true;
		putQ(i+1);
		m[i] = -1;
		col[j] = dpos[i+j] = dneg[i - j + 7] = false;
	}
}
static void print(){
	for(int i = 0; i < 8;i++) {
		for(int j = 0;j < 8;j++) {
			if(m[i] == j) {
				System.out.print("Q");
			}else {
				System.out.print(".");
			}
		}
		System.out.println();
	}
}
}
