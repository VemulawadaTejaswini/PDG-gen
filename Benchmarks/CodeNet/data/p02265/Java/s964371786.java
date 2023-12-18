import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	static int[] numStack = new int[100];
	static int numOfs= 0;
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {
		BufferedReader breader = getReader();
		int num = getInt(breader);
		dList list = new dList();
		for( int i = 0 ; i < num ; i++ ) {
			String[] cmd = getAry(breader);
			if ( cmd[0].equals("insert") == true) {
				list.insert(Integer.valueOf(cmd[1]));
			} else if ( cmd[0].equals("delete")) {
				list.delete(Integer.valueOf(cmd[1]));
			} else if ( cmd[0].equals("deleteFirst")) {
				list.deleteFirst();
			} else if ( cmd[0].equals("deleteLast")) {
				list.deleteLast();
			}
		}
		list.show();
	}
	public static class dList {
		eList list=null;
		public void insert(int key) {
			eList wk;
			wk = new eList(key);
			wk.next = list;
			list = wk;
		}
		public void delete(int key) {
			eList bef = null;
			for( eList wk = list; wk != null ; wk = wk.next ){
				if( wk.key == key ) {
					if ( wk == list ) {
						deleteFirst();
					} else if ( bef != null ) {
						bef.next = wk.next;
					}
					break;
				}
				bef = wk;
			}
		}
		public void deleteFirst() {
			if ( list != null ) {
				list = list.next;
			}
		}
		public void deleteLast() {
			if ( list != null ) {
				eList bef = null;
				for( eList wk = list ; wk != null ; wk = wk.next) {
					if ( wk.next == null ) {
						if ( wk == list ) {
							deleteFirst();
							return;
						} else if ( bef != null){
							bef.next = null;
							return;
						}
					}
					bef = wk;
				}
			}
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
	}
	public static class eList {
		eList next = null;
		int key;
		public eList(int key) {
			this.key = key;
		}
	}
	public static void strEnqueue(String str) {
		strList.add(str);
	}
	public static void intEnqueue(int num) {
		intList.add(num);
	}
	public static String strDequeue() {
		String val;
		if ( strList.size() > 0 ) {
			val = strList.get(0);
			strList.remove(0);
		} else {
			val = null;
		}
		return val;
	}
	public static int intDequeue() {
		int val;
		if ( intList.size() > 0) {
			val = intList.get(0);
			intList.remove(0);
		} else {
			val = -1;
		}
		return val;
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