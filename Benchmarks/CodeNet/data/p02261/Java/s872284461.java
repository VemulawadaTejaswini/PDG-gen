import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ALDS1_2_C {

	public static void main(String[] args) throws Exception {
		BufferedReader breader = getReader();
		int n = getInt(breader); 
		String[] num = getAry(breader);
		int c = cardComp(num[0],num[1]);
		boolean stable = true;
		//duplicate ary
		String[] numbk = new String[n];
		for( int i = 0 ; i < n ; i++ ) {
			numbk[i] = num[i];
		}
		//initialize number array
		int[] nary = new int[n];
		for( int i = 0 ; i < n ; i++ ) {
			nary[i] = i;
		}
		//Bubble sort
		for( int i = 0 ; i < n ; i++ ) {
			for( int j = n-1 ; j > 0 ; j-- ) {
				if ( cardComp(num[j-1], num[j])> 0) {
					String wk = num[j-1];
					num[j-1] = num[j];
					num[j] = wk;
					int nwk = nary[j-1];
					nary[j-1] = nary[j];
					nary[j] = nwk;
				}
			}
		}
		stable = true;
		for( int i = 0 ; i < n-1 ; i++ ) {
			if ( cardComp(num[i], num[i+1]) == 0) {
				if ( nary[i] > nary[i+1] ) {
					stable = false;
					break;
				}
			}
		}
		putAry(num);
		if ( stable == true ) {
			System.out.println( "Stable");
		} else {
			System.out.println("Not stable");
		}
		//Selection sort
		//restore ary
		for( int i = 0 ; i < n ; i++ ) {
			num[i] = numbk[i];
			nary[i] = i;
		}
		for( int i = 0 ; i < n ; i++ ) {
			int mini = i;
			for( int j = i+1 ; j < n ; j++ ) {
				if ( cardComp(num[mini], num[j])> 0) {
					mini = j;
				}
			}
			String wk = num[i];
			num[i] = num[mini];
			num[mini] = wk;
			int nwk = nary[i];
			nary[i] = nary[mini];
			nary[mini] = nwk;
		}
		stable = true;
		for( int i = 0 ; i < n-1 ; i++ ) {
			if ( cardComp(num[i], num[i+1]) == 0) {
				if ( nary[i] > nary[i+1] ) {
					stable = false;
					break;
				}
			}
		}
		putAry(num);
		if ( stable == true ) {
			System.out.println( "Stable");
		} else {
			System.out.println("Not stable");
		}
	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(System.in)));
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
	public static void putAry(Object[] ary, int num) {
		for( int i = 0; i < num ; i++ ) {
			System.out.print(ary[i]);
			if ( i < num-1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	public static void putAry(Object[] ary) {
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