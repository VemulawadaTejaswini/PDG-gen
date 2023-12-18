import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br;
		if( args.length > 0 && args[0].equals("File") == true ) {
			br = getReader("C:\\Users\\USER\\Downloads\\ALDS1_4_A_1.txt");
		} else {
			br = getReader();
		}
		int snum = getInt(br);
		int[] snumAry = getIntAry(br);
		int tnum = getInt(br);
		int[] tnumAry = getIntAry(br);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for( int s = 0; s < snumAry.length ; s++ ) {
			for( int t = 0 ; t < tnumAry.length ; t++ ) {
				if ( snumAry[s] == tnumAry[t]) {
					list.add(snumAry[s]);
					count++;
					break;
				}
			}
		}
//		for( int v : list ) {
//			System.out.print(v + " ");
//		}
//		System.out.println("");
		System.out.println(count);
	}
	public static class dList {
		eList list=null;
		eList last=null;
		eList garbage=null;
		static final int anum = 2000;
		eList[] eAry = new eList[anum];
		public void insert(int key) {
			eList wk;
			if ( garbage == null ) {
				wk = new eList(key);
			} else {
				wk = garbage;
				wk.next = null;
				garbage = garbage.next;
				wk.key = key;
			}
			wk.next = list;
			wk.prev = null;
			if ( list == null ) {
				last = wk;
			} else {
				list.prev = wk;
			
			}
			list = wk;
			//????????????????????????????????\
			int idx = getIdx(key);
			wk.knext = eAry[idx] ;
			if ( eAry[idx] != null ) {
				eAry[idx].kprev = wk;
			} 
			wk.kprev = null;
			eAry[idx] = wk;
		}
		public void delete(int key) {
			int idx = getIdx(key);
			for( eList wk = eAry[idx]; wk != null ; wk = wk.knext ){
				if( wk.key == key ) {
					deleteElm(wk);
					break;
				}
			}
		}
		public void deleteElm( eList elm) {
			//????????????
			if ( elm.prev == null ) {
				list = elm.next;
				if ( list != null ) list.prev = null;
			} else {
				elm.prev.next = elm.next;
			}
			if ( elm.next == null ) {
				last = elm.prev;
				if ( last != null ) last.next = null;
			} else {
				elm.next.prev = elm.prev;
			}
			//??????????????????????????????
			int idx = getIdx(elm.key);
			if ( elm.kprev == null ) {
				eAry[idx] = elm.knext;
				if ( eAry[idx] != null ) eAry[idx].kprev = null;
			} else {
				elm.kprev.knext = elm.knext;
			}
			if ( elm.knext == null ) {
				/*elAry[idx] = elm.kprev;*/
			} else {
				elm.knext.kprev = elm.kprev;
			}
			//??¬???????????????????????????
			elm.next = garbage;
			elm.prev = null;
			elm.kprev = null;
			elm.knext = null;
			garbage = elm;
			
		
		}
		public void deleteFirst() {
			deleteElm(list);
		}
		public void deleteLast() {
			deleteElm(last);
		}
		public void show() {
			for( eList wk = list ; wk != null ; wk = wk.next){
				System.out.print(wk.key);
				if ( wk.next != null ) {
					System.out.print(" ");
				}
			}
			System.out.println( "" );
		}
		public int getIdx(int key) {
			int idx = key/1000;
			if ( idx >= anum ) idx = 199;
			return idx;
		}
	}
	public static class eList {
		eList next = null;
		eList prev = null;
		eList knext = null;
		eList kprev = null;
		int key;
		public eList(int key) {
			this.key = key;
		}
	}
	public static BufferedReader getReader() {
		return( new BufferedReader(new InputStreamReader(
				System.in)));
	}
	public static BufferedReader getReader(String path) throws Exception{
		return( new BufferedReader(new InputStreamReader(
				new FileInputStream(path))));
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