import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @author yoshikyoto
 */
class Main{
	static final boolean DEBUG = false;
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws Exception{

        int n = readInt();
        for (int i = 0; i < n; i++) {
            String[] values = readLine().split(" ");
            double x1 = Double.parseDouble(values[0]);
            double y1 = Double.parseDouble(values[1]);
            double x2 = Double.parseDouble(values[2]);
            double y2 = Double.parseDouble(values[3]);
            double x3 = Double.parseDouble(values[4]);
            double y3 = Double.parseDouble(values[5]);
            double x4 = Double.parseDouble(values[6]);
            double y4 = Double.parseDouble(values[7]);
            double det = (x2 - x1) * (y4 - y3) - (y2 - y1) * (x4 - x3);
            p(det == 0.0 ? "YES" : "NO");
        }
	}
		

	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
	public static void pa(Object[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(int[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(double[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(boolean[] arr){System.out.println(Arrays.toString(arr));}
	public static void p(Object o){System.out.println(o.toString());}
	public static void pr(Object o){System.out.print(o.toString());}
	public static void e(Object o){System.err.println(o.toString());}
	public static void d(Object o){if(DEBUG)System.out.println(o.toString());}
	public static void da(int[] arr){if(DEBUG)System.out.println(Arrays.toString(arr));}
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
	public static boolean isParallel(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
	    if((x2-x1)*(y4-y3) == (y2-y1)*(x4-x3)) return true;
	    else return false;
	}
}

/**
 * 整数を数え上げたりするクラス
 * Prime.calc(int n) でnまでエラトステネスの篩を実行。
 * @author yoshikyoto
 * @param a[i] iが素数の時true
 * @param count[i] i以下の素数の数
 */
class Prime{
	static boolean[] a;
	static int[] count;
	public static void calc(int n){
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