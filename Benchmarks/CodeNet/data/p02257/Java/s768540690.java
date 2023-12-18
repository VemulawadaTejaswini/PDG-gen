import java.util.Arrays;
import java.util.Scanner;

class Hoge {
	private static void print(String s) { System.out.print(s);}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num_primes = 0;

		initTable();

		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			if(primeTable[x]) num_primes++;
			updatePrimeTable(x);
		}
		print(num_primes+"\n");
	}
	static boolean[] primeTable = new boolean[10001];
	public static void initTable() {
		Arrays.fill(primeTable, true);
		primeTable[0]=false;
		primeTable[1]=false;
	}

	public static void updatePrimeTable(int x) {
		if(!primeTable[x]) return;
		for(int i=x; i<primeTable.length; i+=x) {
			primeTable[i] = false;
		}
	}
}
