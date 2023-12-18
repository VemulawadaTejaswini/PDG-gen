import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader breader = getReader();

		int n = getInt(breader);
		int[] ary = getAry(breader);
		putAry(ary);
		for( int i = 1 ; i < ary.length ; i++) {
			int key = ary[i] ;
			int j = i - 1;
			while( j >= 0 && ary[j] > key ) {
				ary[j+1] = ary[j] ;
				j--;
			}
			ary[j+1] = key;
			putAry(ary);
		}
	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(System.in)));
	}
	public static int getInt(BufferedReader br)throws Exception {
		String line = br.readLine();
		return Integer.valueOf(line);
	}
	public static int[] getAry(BufferedReader br)throws Exception {
		String line = br.readLine();
		String[] nstr = line.split(" ");
		int[] n = new int[nstr.length];
		for( int i=0 ; i < nstr.length ; i++ ) {
			n[i] = Integer.valueOf(nstr[i]);
		}
		return n;
	}
	public static void putAry(int[] ary) {
		for( int i = 0; i < ary.length ; i++ ) {
			System.out.print(ary[i]);
			if ( i < ary.length-1) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}

}