import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	static int[] numStack = new int[100];
	static int numOfs= 0;

	public static void main(String[] args) throws Exception {
		BufferedReader breader = getReader();
		String[] elm = getAry(breader);
		for( int i = 0 ; i < elm.length ; i++ ) {
			if (elm[i].equals("+") == true) {
				numPush(numPop()+numPop());
			} else if ( elm[i].equals("-") == true ) {
				numPush(-(numPop()-numPop()));
			} else if ( elm[i].equals("*") == true ) {
				numPush(numPop()*numPop());
			} else {
				numPush(Integer.valueOf(elm[i]));
			}
		}
		System.out.println(numPop());
	}
	public static void numPush(int n) {
		numStack[numOfs++] = n;
	}
	public static int numPop() {
		return(Integer.valueOf(numStack[--numOfs]));
	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(
				System.in)));
	}
	public static int getInt(BufferedReader br)throws Exception {
		String line = br.readLine();
		return Integer.valueOf(line);
	}
	public static String[] getAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		return nstr;
	}
	public static int[] getIntAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		int[] n = new int[nstr.length];
		for( int i=0 ; i < nstr.length ; i++ ) {
			n[i] = Integer.valueOf(nstr[i]);
		}
		return n;
	}
	public static int cardComp(String left, String right) {
		char l = left.charAt(1);
		char r = right.charAt(1);
		return(l-r);
	}
	public static int[] getAryMl(BufferedReader br)throws Exception {
		int n = getInt(br);
		int[] ary = new int[n];
		for( int i=0 ; i < n ; i++ ) {
			ary[i] = getInt(br);
		}
		return ary;
	}
	public static void putAry(int[] ary, int num) {
		for( int i = 0; i < num ; i++ ) {
			System.out.print(ary[i]);
			if ( i < num-1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	public static void putAry(int[] ary) {
		putAry(ary, ary.length ) ;
	}
	public static boolean isPrime(int n) {
		int r = (int)Math.sqrt((double)n)+1;
		for( int j = 2 ; j < r ; j += 1) {
			if ( n%j == 0 ) {
				return false;
			}
		}
		return true;
	}

}