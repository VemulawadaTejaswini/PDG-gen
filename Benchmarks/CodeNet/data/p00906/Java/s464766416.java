import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.*;


class Main {
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int t = sc.nextInt();
			if(n+m+a+b+c+t == 0) break;

			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
			}
			// System.out.println(Arrays.toString(s));

			int[][] matrix = new int[n][n];

			for (int i = 0; i < n; i++) {
				matrix[i][i] = b;
			}
			for (int i = 1; i < n; i++) {
				matrix[i][i-1] = a;
				matrix[i-1][i] = c;
			}
			//		System.out.println("--- before matrix ----------");
			//		for (int i = 0; i < n; i++) {
			//			StringBuffer buf = new StringBuffer();
			//			for (int j = 0; j < n; j++) {
			//				buf.append(matrix[i][j] + " ");
			//			}
			//			System.out.println(buf.toString().trim());
			//		}

			matrix = modPow(matrix, t, m);

			//		System.out.println("--- after matrix ----------");
			//		for (int i = 0; i < n; i++) {
			//			StringBuffer buf = new StringBuffer();
			//			for (int j = 0; j < n; j++) {
			//				buf.append(matrix[i][j] + " ");
			//			}
			//			System.out.println(buf.toString().trim());
			//		}


			//		System.out.println("--- ans --------------------");
			StringBuffer buf = new StringBuffer();
			for (int i = 0; i < n; i++) {
				int ans = 0;
				for (int j = 0; j < n; j++) {
					ans += matrix[i][j] * s[j];
				}
				buf.append((ans % m) + " ");
			}
			System.out.println(buf.toString().trim());
		}
	}

	static int[][] modPow(int[][] matrix, int t, int m) {
		// System.out.println("modpow " + t + " " + m);
		matrixMod(matrix, m);
		if(t == 0) {
			int n = matrix.length;
			int[][] ans = new int[n][n];
			for (int i = 0; i < n; i++) {
				ans[i][i] = 1;
			}
			return ans;
		}
		if(t == 1) return matrix;

		if(t % 2 == 0) {
			int[][] mult = matrixMod(matrixMult(matrix, matrix), m);
			return matrixMod(modPow(mult, t/2, m), m);
		} else {
			int[][] mult = matrixMod(matrixMult(matrix, matrix), m);
			return matrixMod(matrixMult(modPow(mult, t/2, m), matrix), m);
		}
	}

	static int[][] matrixMod(int[][] a, int m) {
		int n = a.length;
		int[][] b = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = a[i][j] % m;
			}
		}
		return b;
	}

	static int[][] matrixMult(int[][] a, int[][] b){
		int n = a.length;
		int[][] c = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
}


/**
 * 複素数
 */
class Complex {
	static Complex I = new Complex(0, 1);

	double r = 0.0;
	double i = 0.0;
	Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}

	/**
	 * 和
	 */
	public Complex add(Complex a) {
		return new Complex(r * a.r, i + a.i);
	}

	/**
	 * 積
	 */
	public Complex mul(Complex a) {
		return new Complex(
				r * a.r - i * a.i,
				r * a.i + i * a.r);
	}

	public Complex divide(double a) {
		return new Complex(r/a, i/a);
	}

	public Complex inverse() {
		double b = 1 / (r*r + i*i);
		return new Complex(r/b, -i/b);
	}


	@Override
	public String toString(){
		return r + "+" + i + "i";
	}
}




// --- ここから下はライブラリ ----------
/**
 * MyUtil
 * @author yoshikyoto
 */
class MyIO {
	public static int toInt(boolean[] a){
		int pow = 1, ret = 0, l = a.length;
		for(int i = 0; i < l; i++){
			if(a[i]) ret += pow;
			pow *= 2;
		}
		return ret;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int ins[];
	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static int readIntMap(int i) throws Exception{
		if(i == 0) ins = readIntMap();
		return ins[i];
	}
	public static int[][] readIntMap(int n, int m) throws IOException{
		int[][] ret = new int[n][];
		for(int i = 0; i < n; i++) ret[i] = readIntMap();
		return ret;
	}
	public static int[] readIntToMap(int n) throws IOException{
		int[] ret = new int[n];
		for(int i = 0; i < n; i++) ret[i] = readInt();
		return ret;
	}
	public static int[] readNoDistIntMap() throws IOException{
		String[] strs = readLine().split("");
		int l = strs.length;
		int[] ret = new int[l-1];
		for(int i = 1; i < l; i++)
			ret[i-1] = parseInt(strs[i]);
		return ret;
	}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
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
	public static int parseInt(Object o){
		return Integer.parseInt(o.toString());
	}
}