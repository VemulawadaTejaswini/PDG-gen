import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	static int[] read_line_int;
	static int read_line_int_ptr;
	static long[] read_line_long;
	static int read_line_long_ptr;
	static String[] read_line;
	static int read_line_ptr;
	static int[] cache;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		cache = new int[200001];
		Arrays.fill(cache,-1);
		//code here
		int N = readInt();
		char[] X = readLine()[0].toCharArray();
		boolean[] x = new boolean[N];
		int basepopcnt = 0;
		for(int n=0;n<N;n++) {
			switch(X[n]) {
				case '1':
					basepopcnt++;
					x[n] = true;
					break;
				case '0':
					x[n] = false;
					break;
				default:
					print("ERR");return;
			}
		}
		int baseans = count(x);
		long modnow = basepopcnt;
		for(int i=0;i<N;i++) {
			x[i] = !x[i];
			print(count(x));
			x[i] = !x[i];
			
		}
	}
	
	//functions here
	//note that all methods should be STATIC
	private static int popcount(boolean[] x) {
		int modnow = 0;
		for(int i=0;i<x.length;i++) {if(x[i]) {modnow++;}}
		return modnow;
	}
	private static int count(boolean[] base) {
		int ans = 0;
		boolean[] now = base;
		ArrayList<Integer> cache_add = new ArrayList<>();
		while(!isZero(now)) {
			if(toNumL(now)<200001) {
				int num = toNum(now);
				if(cache[num]>=0) {
					//hit cache
					//print("hit");
					for(int plus=1;cache_add.size()>0;plus++) {
						int p = cache_add.remove(cache_add.size()-1);
						if(p>=0) {
							cache[p] = cache[num]+plus+ans;
						}
					}
					return cache[num]+ans;
				}else {
					cache_add.add(num);
				}
			}else {
				cache_add.add(-1);
			}
			int modnow = popcount(now);
			now = mod(now,toBitArray(modnow));
			ans++;
		}
		for(int plus=1;cache_add.size()>0;plus++) {
			int p = cache_add.remove(cache_add.size()-1);
			if(p>=0) {
				cache[p] = plus;
			}
		}
		return (ans);
	}
	private static boolean[] toBitArray(long num) {
		ArrayList<Boolean> ansb = new ArrayList<>();
		for(;num>1;num/=2) {
			ansb.add(num%2==1);
		}
		ansb.add(num%2==1);
		boolean[] ans = new boolean[ansb.size()];
		for(int i=0;i<ans.length;i++) {
			ans[i] = ansb.get(ans.length-i-1);
		}
		return ans;
	}
	private static boolean isZero(boolean[] bools) {
		for(int i=0;i<bools.length;i++) {
			if(bools[i]) {return false;}
		}
		return true;
	}
	private static long toNumL(boolean[] bools) {
		long ans = 0;
		for(int i=0;i<bools.length;i++) {
			ans*=2;
			if(bools[i]) {ans++;}
		}
		return ans;
	}
	private static int toNum(boolean[] bools) {
		int ans = 0;
		for(int i=0;i<bools.length;i++) {
			ans*=2;
			if(bools[i]) {ans++;}
		}
		return ans;
	}
	private static boolean[] mod(boolean[] base, boolean[] div) {
		boolean[] ans = Arrays.copyOf(base,base.length);
		int zeroptr = 0;
		for(int ptr = 0; ptr<ans.length-div.length+1;ptr++) {
			boolean larger = false;
			boolean smaller = false;
			for(int ptrt=zeroptr;ptrt<ptr;ptrt++) {
				if(ans[ptrt]) {larger=true;break;}
			}
			if(!larger) {
				for(int check = 0;check<div.length;check++) {
					if(ans[ptr+check]&&!div[check]) {
						larger = true;break;
					}else if(!ans[ptr+check]&&div[check]) {
						smaller = true;break;
					}
				}
			}
			if(!smaller) {
				//minus
				boolean digit = false;
				for(int m=div.length-1;m>=0||digit;m--) {
					if(!digit) {
						if(!(div[m])) {continue;}
						if(ans[ptr+m]) {ans[ptr+m]=false;}
						else{ans[ptr+m]=true;digit=true;}
					}else {
						digit = false;
						if((m<0||!div[m])&&ans[ptr+m]) {ans[ptr+m]=false;}
						else if((m<0||!div[m])&&!ans[ptr+m]) {ans[ptr+m]=true;digit=true;}
						else if((m>=0&&div[m])&&ans[ptr+m]) {ans[ptr+m]=true;digit=true;}
						else{ans[ptr+m]=false;digit=true;}
					}
				}
				for(;!base[zeroptr];zeroptr++) {
					
				}
			}
		}
		
		return ans;
	}

	private static <T> int arraySearch(T needle, T[] heystack) {
		for(int i=0;i<heystack.length;i++) {
			if(needle.equals(heystack[i])) {
				return i;
			}
		}
		return -1;
	}
	private static int[] sort(int[] base) {
		int[] copy = array_copy(base);
		Arrays.sort(copy);
		return copy;
	}
	private static int[] array_copy(int[] base) {
		int[] copy = new int[base.length];
		for(int i=0;i<base.length;i++) {
			copy[i] = base[i];
		}
		return copy;
	}
	private static int[] asArray(ArrayList<Integer> ints) {
		int[] intlist = new int[ints.size()];
		for(int i=0;i<intlist.length;i++) {
			intlist[i] = ints.get(i);
		}
		return intlist;
	}
	private static int readInt() {
		if(read_line_int==null||read_line_int_ptr==read_line_int.length) {
			read_line_int = readLineInt();
			read_line_int_ptr=0;
		}
		return read_line_int[read_line_int_ptr++];
	}
	private static long readLong() {
		if(read_line_long==null||read_line_long_ptr==read_line_long.length) {
			read_line_long = readLineLong();
			read_line_long_ptr=0;
		}
		return read_line_long[read_line_long_ptr++];
	}
	private static String readString() {
		if(read_line==null||read_line_int_ptr==read_line.length) {
			read_line = readLine();
			read_line_ptr=0;
		}
		return read_line[read_line_ptr++];
	}
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static int[] readLineInt(){
		try{
			String[] s = readLine();
			int[] ints = new int[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Integer.parseInt(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static long[] readLineLong(){
		try{
			String[] s = readLine();
			long[] ints = new long[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Long.parseLong(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static byte[] readLineByte(){
		try{
			String[] s = readLine();
			byte[] bytes = new byte[s.length];
			for(int i=0;i<bytes.length;i++) {
				bytes[i] = Byte.parseByte(s[i]);
			}
			return bytes;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static char[] readLineChar(){
		try{
			String[] s = readLine();
			char[] chars = new char[s.length];
			for(int i=0;i<chars.length;i++) {
				chars[i] = (char)Integer.parseInt(s[i]);
			}
			return chars;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
	private static void printd(Object o){
		if(MODE_DEBUG)System.err.println(o);
	}
	private static void printd(){
		if(MODE_DEBUG)System.err.println();
	}
}
