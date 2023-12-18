import java.io.*;
import java.math.BigInteger;
import java.util.*;


/**
 * @author yoshikyoto
 */
class Main{
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static ArrayList<ArrayList<Integer>> g;
	public static HashSet<Integer> set;
	
	public static void main(String args[]) throws Exception{
		String line = "";
		while((line = readLine()) != null){
			int a[] = parseInt(line.split(" "));
			int b[] = readIntMap();
			
			int hit = 0, blow = 0;
			for(int i = 0; i < 4; i++)
				for(int j = 0; j < 4; j++){
					if(a[i] == b[j]){
						if(i == j) hit++;
						else blow++;
					}
				}
			p(hit + " " + blow);
		}
	}
	

	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
	public static void pa(Object[] arr){System.out.println(Arrays.toString(arr));}
	public static void p(Object o){System.out.println(o.toString());}
	public static void pr(Object o){System.out.print(o.toString());}
	public static void e(Object o){System.err.println(o.toString());}
	public static void ea(Object[] o){System.err.println(Arrays.toString(o));}
	public static void ea(int[] arr){System.err.println(Arrays.toString(arr));}
	public static void ea(double[] arr){System.err.println(Arrays.toString(arr));}
	public static void ea(boolean[] arr){System.err.println(Arrays.toString(arr));}
	public static void sort(int[] a){Arrays.sort(a);}
	public static int[] parseInt(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Integer.parseInt(arr[i]);
		return res;
	}
	public static double[] parseDouble(String[] arr){
		double[] res = new double[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Double.parseDouble(arr[i]);
		return res;
	}
	public static boolean[] parseBool(String[] arr){
		int[] t = parseInt(arr);
		boolean[] res = new boolean[t.length];
		for(int i = 0; i < t.length; i++){
			if(t[i] == 1){res[i] = true;
			}else{res[i] = false;}
		}
		return res;
	}
	public static int parseInt(Object o){return Integer.parseInt(o.toString());}
	public static int digit(int n){return String.valueOf(n).length();}
	public static String reverse(String s){
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	public static double sin(int r){return Math.sin(Math.toRadians(r));}
	public static double cos(int r){return Math.cos(Math.toRadians(r));}
	public static boolean isCross(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
	    // 並行な場合
	    int m = (x2-x1)*(y4-y3)-(y2-y1)*(x4-x3);
	    if(m == 0) return false;
	    // 媒介変数の値が0より大きく1以下なら交差する、これは問題の状況によって変わるかも。
	    double r =(double)((y4-y3)*(x3-x1)-(x4-x3)*(y3-y1))/m;
	    double s =(double)((y2-y1)*(x3-x1)-(x2-x1)*(y3-y1))/m;
	    return (0 < r && r <= 1 && 0 < s && s <= 1);
	}
	public static boolean isParallel(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
	    if((x2-x1)*(y4-y3) == (y2-y1)*(x4-x3)) return true;
	    else return false;
	}
	public static double square(double d){return d*d;}
	public static int square(int i){return i+i;}
	public static int sqdist(int x1, int y1, int x2, int y2){
		return square(x1-x2) + square(y1-y2);}
	public static double sqdist(double x1, double y1, double x2, double y2){
		return square(x1-x2) + square(y1-y2);}
	public static double dist(int x1, int y1, int x2, int y2){
		return Math.sqrt(sqdist(x1, y1, x2, y2));}
	public static double dist(double x1, double y1, double x2, double y2){
		return Math.sqrt(sqdist(x1, y1, x2, y2));}
	
	
}

/**
 * 整数を数え上げたりするクラス
 * Prime.calc(int n) でnまでエラトステネスの篩を実行。
 * @author yoshikyoto
 * @param a[i] iが素数の時true
 * @param count[i] i以下の素数の数
 */
class Prime{
	boolean[] a;
	int[] count;
	Prime(int n){
		a = new boolean[n+1];
		a[0] = false; a[1] = false;
		for(int i = 2; i <= n; i++) a[i] = true;
		// ふるい
		for(int i = 2; i < (n - 3) / 2; i++)
			if(a[i]) for(int j = 2; j * i <= n; j++)
					a[j * i] = false;
		
		// 数え上げ
		count = new int[n+1];
		count[0] = 0;
		for(int i = 1; i <= n; i++){
			int gain = 0;
			if(a[i]) gain = 1;
			count[i] = count[i-1] + gain;
		}
	}
}

class AI extends ArrayList<Integer>{}
class SI extends Stack<Integer>{}

class HI<E> extends HashMap<E, Integer>{
	ArrayList<E> keyArray = new ArrayList<E>();
	public void add(E key){add(key, 1);}
	public void add(E key, Integer value){
		if(containsKey(key)){value += get(key);
		}else{keyArray.add(key);}
		put(key, value);
	}
}