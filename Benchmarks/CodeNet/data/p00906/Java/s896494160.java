import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int t = sc.nextInt();
			if (n == 0) {
				break;
			}
			long[] s = new long[n];
			for(int i=0;i<n;i++) {
				s[i] = sc.nextInt();
			}
			MatrixMod.MOD = m;
			MatrixMod ms = new MatrixMod(s);
			MatrixMod mm = new MatrixMod(n, n);
			for(int i=0;i<n;i++) {
				if (i > 0) {
					mm.a[i][i-1] = a;
				}
				mm.a[i][i] = b;
				if (i < n - 1) {
					mm.a[i][i+1] = c;
				}
			}
			MatrixMod ans = mm.powThis(t).multiplyRightToThis(ms);
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<n;i++) {
				if (i > 0) {
					sb.append(" ");
				}
				sb.append(ans.a[i][0]);
			}
			System.out.println(sb.toString());
		}
	}

}

class MatrixMod {
	public static long MOD = 10000;
	public long[][] a;
	public MatrixMod(long[][] a) {
		if (a.length == 0 || a[0].length == 0) {
			throw new RuntimeException("Unexpected size matrix");
		}
		this.a = a;
	}
	public MatrixMod(long[] vector) {
		this(new long[vector.length][1]);
		for(int i=0;i<vector.length;i++) {
			a[i][0] = vector[i];
		}
	}
	public MatrixMod(int rows,int columns) {
		this(new long[rows][columns]);
	}
	public MatrixMod(int idMatrixSize) {
		this(new long[idMatrixSize][idMatrixSize]);
		for(int i=0;i<idMatrixSize;i++) {
			a[i][i] = 1;
		}
	}
	public MatrixMod set(MatrixMod A) {
		this.a = A.a;
		return this;
	}
	public int rows() {
		return a.length;
	}
	public int columns() {
		return a[0].length;
	}
	public static MatrixMod add(MatrixMod A,MatrixMod B) {
		if (A.rows() != B.rows() || A.columns() != B.columns()) {
			throw new RuntimeException("Undefined addition");
		}
		MatrixMod C = new MatrixMod(A.rows(),A.columns());
		for(int i=0;i<A.rows();i++) {
			for(int j=0;j<A.columns();j++) {
				C.a[i][j] = (A.a[i][j] + B.a[i][j]) % MOD;
			}
		}
		return C;
	}
	public static MatrixMod multiply(MatrixMod A,long c) {
		for(int i=0;i<A.rows();i++) {
			for(int j=0;j<A.columns();j++) {
				A.a[i][j] = (A.a[i][j] * c) % MOD;
			}
		}
		return A;
	}
	public static MatrixMod multiply(MatrixMod A,MatrixMod B) {
		if (A.columns() != B.rows()) {
			throw new RuntimeException("Undefined multiplicaiton");
		}
		MatrixMod C = new MatrixMod(A.rows(),B.columns());
		for(int i=0;i<A.rows();i++) {
			for(int j=0;j<B.columns();j++) {
				for(int k=0;k<A.columns();k++) {
					C.a[i][j] = (C.a[i][j] + A.a[i][k] * B.a[k][j]) % MOD;
				}
			}
		}
		return C;
	}
	public static MatrixMod pow(MatrixMod A,long n) {
		if (A.rows() != A.columns()) {
			throw new RuntimeException("Undefined multiplicaiton");
		}
		MatrixMod M = A.clone();
		MatrixMod X = new MatrixMod(A.rows());
		while(n>0) {
			if (n%2==1) {
				X.multiplyRightToThis(M);
			}
			n/=2;
			if (n>0) {
				M.multiplyRightToThis(M);
			}
		}
		return X;
	}
	public MatrixMod addToThis(MatrixMod B) {
		set(add(this,B));
		return this;
	}
	public MatrixMod multiplyThis(long c) {
		set(multiply(this, c));
		return this;
	}
	public MatrixMod multiplyRightToThis(MatrixMod B) {
		set(multiply(this,B));
		return this;
	}
	public MatrixMod powThis(int n) {
		set(pow(this, n));
		return this;
	}
	public MatrixMod clone() {
		MatrixMod A = new MatrixMod(rows(), columns());
		for(int i=0;i<rows();i++) {
			for(int j=0;j<columns();j++) {
				A.a[i][j] = a[i][j];
			}
		}
		return A;
	}
	public int hashCode() {
		int hashcode = 0;
		for(int i=0;i<rows();i++) {
			hashcode ^= Arrays.hashCode(a[i]);
		}
		return hashcode;
	}
	public boolean equals(Object o) {
		if (!(o instanceof MatrixMod)) {
			return false;
		}
		MatrixMod A = (MatrixMod) o;
		if (this.rows() != A.rows() || this.columns() != A.columns()) {
			return false;
		}
		for(int i=0;i<A.rows();i++) {
			if (!Arrays.equals(a[i], A.a[i])) {
				return false;
			}
		}
		return true;
	}
	public String toString() {
		return Arrays.deepToString(a);
	}
}