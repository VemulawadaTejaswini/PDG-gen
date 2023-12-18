import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private boolean check(int[] arr, int idx) {
		boolean a = idx >= 2 && arr[idx-2] == arr[idx-1] && arr[idx-1] == arr[idx];
		boolean b = idx >=1 && idx<=3 && arr[idx-1] == arr[idx] && arr[idx] == arr[idx+1];
		boolean c = idx<=2 && arr[idx] == arr[idx+1] && arr[idx+1] == arr[idx+2];
		
		return a||b||c;
	}
	
	private long solv(int [][] b, int H) {
		long score = 0;
		//消す
		for(int i=0;i<H;i++) {
			int[] nl = Arrays.copyOf(b[i], b[i].length);
			for(int j=0;j<=4;j++) {
				if( check(b[i], j)) {
					score += b[i][j];
					nl[j] = 0;
				}
			}
			b[i] = nl;
		}
		
		if(score == 0) {
			return 0;
		}
		
		//落とす
		for(int t=0;t<H;t++) {
			for(int i=H-1;i>=1;i--) {
				for(int j=0;j<5;j++) {
					if(b[i][j] == 0) {
						b[i][j] = b[i-1][j];
						b[i-1][j] = 0;
					}
				}
			}
		}
		
		return score + solv(b,H);
	}
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		while(true) {
			int H = sc.nextInt();
			
			if(H==0) {
				break;
			}
			int[][] b = new int[H][5];
			for(int i=0;i<H;i++) {
				for(int j=0;j<5;j++) {
					b[i][j] = sc.nextInt();
				}
			}
			out.println(solv(b,H));
		}
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, long[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long max(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int min(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long min(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}

