
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
	int D;
	double[] V = new double[10];
	public void solve() {
		while(true){
			D = nextInt();
			if(D == 0) break;
			for(int i = 0; i < D + 3; i++){
				V[i] = Double.parseDouble(next());
			}
			DoubleMatrix mat = new DoubleMatrix(D + 1, D + 1);
			DoubleVector b = new DoubleVector(D + 1);
			double min = Double.MAX_VALUE;
			int mini = 0;
			for(int i = 0; i < D + 3; i++){
				int idx = 0;
				int j;
				for(j = 0; idx < D + 1; j++){
					if(i == j) continue;
					double po = 1;
					for(int k = 0; k < D + 1; k++){
						mat.set(idx, k, po);
						po *= j;
					}
					b.set(idx, V[j]);
					idx++;
				}
				solve(mat, b);
				if(i == j) j++;
				double po = 1;
				double val = 0;
				for(int k = 0; k < D + 1; k++){
					val += b.get(k) * po;
					po *= j;
				}
				if(Math.abs(val - V[j]) < min){
					min = Math.abs(val - V[j]);
					mini = i;
				}
			}
			out.println(mini);
		}
	}
	public DoubleMatrix identity(int n){
		DoubleMatrix mat = new DoubleMatrix(n, n);
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j) mat.set(i, j, 1.0);
				else mat.set(i, j, 0.0);
			}
		}
		return mat;
	}
	
	
	class DoubleMatrix {
		public final int row;
		public final int colum;
		double[] data;
		public DoubleMatrix(int row, int colum){
			this.row = row;
			this.colum = colum;
			this.data = new double[row * colum];
		}
		
		public int index(int r, int c){
			if(0 <= r && r < row && 0 <= c && c <= colum){
				return r * colum + c;
			}else{
				throw new IndexOutOfBoundsException("Matrix size row: " + row + " colum:" + colum + "access: (" + r + "," + c + ")");
			}
		}
		
		public void set(int r, int c, double v){
			this.data[index(r,c)] = v;
		}
		public double get(int r, int c){
			return this.data[index(r,c)];
		}
		
	
		public DoubleMatrix mul(DoubleMatrix mat){
			if(this.colum != mat.row) throw new ArithmeticException();
			DoubleMatrix ans = new DoubleMatrix(this.row, mat.colum);
			for(int i = 0; i < ans.row; i++){
				for(int j = 0; j < ans.colum; j++){
					double sum = 0;
					for(int k = 0; k < this.colum; k++){
						sum += get(i, k) * mat.get(k, j);
					}
					ans.set(i, j, sum);
				}
			}
			return ans;
		}
		
		public DoubleVector mul(DoubleVector vec){
			if(this.colum != vec.size) throw new ArithmeticException();
			DoubleVector ans = new DoubleVector(this.row);
			for(int i = 0; i < ans.size; i++){
				double sum = 0;
				for(int j = 0; j < this.colum; j++){
					sum += get(i, j) * vec.get(j);
				}
				ans.set(i, sum);
			}
			return ans;
		}
		
		public DoubleMatrix pow(int n){
			if(this.colum != this.row) throw new ArithmeticException();
			if(n == 0) return identity(this.row);
			if(n % 2 == 0) return (this.mul(this)).pow(n / 2);
			else return this.mul(this.pow(n - 1));
		}
		
		public String toString(){
			StringBuilder build = new StringBuilder();
			build.append("[");
			for(int i = 0; i < row; i++){
				build.append("[");
				for(int j = 0; j < colum; j++){
					if(j != 0) build.append(",");
					build.append(get(i, j));
				}
				build.append("]");
				if(i != row - 1) build.append(",");
				build.append("\n");
			}
			return build.toString();
		}
	}

	class DoubleVector{
		public final int size;
		private double[] data;
		public DoubleVector(int size){
			this.size = size;
			data = new double[size];
		}

		public void set(int i, double v){
			this.data[i] = v;
		}
		public double get(int i){
			return this.data[i];
		}
		public String toString(){
			StringBuilder build = new StringBuilder();
			build.append("[");
			for(int i = 0; i < size; i++){
					if(i != 0) build.append(",");
					build.append(get(i));
			}
			
			build.append("]");
			return build.toString();
		}
	}
	
	public void solve(DoubleMatrix mat, DoubleVector b){
		int N = mat.row;
		int[] swap = new int[N];
		for(int i = 0; i < N; i++) swap[i] = i;
		
		for(int i = 0; i < N; i++){
			double max = mat.get(swap[i], i);
			int maxi = i;
			for(int j = i + 1; j < N; j++){
				if(max < mat.get(swap[j], i)){
					max = mat.get(swap[j], i);
					maxi = j;
				}
			}
			int tmp = swap[maxi];
			swap[maxi] = swap[i];
			swap[i] = tmp;
			
			double v, val1, val2;
			v = mat.get(swap[i], i);
			for(int j = i + 1; j < N; j++){
				val1 = mat.get(swap[i], j);
				mat.set(swap[i], j, val1 / v);
			}
			b.set(swap[i], b.get(swap[i]) / v);
			mat.set(swap[i], i, 1.0);
			
			for(int j = i + 1; j < N; j++){
				v = mat.get(swap[j], i);
				for(int k = i + 1; k < N; k++){
					val1 = mat.get(swap[j], k);
					val2 = mat.get(swap[i], k);
					mat.set(swap[j], k, val1 - val2 * v);
				}
				val1 = b.get(swap[j]);
				val2 = b.get(swap[i]);
				b.set(swap[j], val1 - val2 * v);
				
				mat.set(swap[j], i, 0.0);
			}
		}
		for(int i = N - 2; i >= 0; i--){
			double val = b.get(swap[i]);
			for(int j = i + 1; j < N; j++){
				val -= mat.get(swap[i], j) * b.get(swap[j]);
			}
			b.set(swap[i], val);
		}
		double[] tmp = new double[N];
		for(int i = 0; i < N; i++){
			tmp[i] = b.get(swap[i]);
		}
		for(int i = 0; i < N; i++){
			b.set(i, tmp[i]);
		}
	}

	private static PrintWriter out;

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}

	public static int nextInt() {
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(; i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	public static long nextLong() {
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(; i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	public static String next() {
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}

	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;

	private static int read() {
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return(bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}

	private static boolean isAlNum(int c) {
		return '!' <= c && c <= '~';
	}
}