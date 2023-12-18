import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;
class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		while(true) {
			int leng=sc.nextInt();
			if(leng==0) {
				System.exit(0);
			}
			int shopsnum=sc.nextInt();
			int order=sc.nextInt();
			int[] shop=new int[shopsnum+1];
			shop[shopsnum]=leng;
			shop[0]=0;
			for(int i=0; i<shopsnum-1; i++) {
				shop[i+1]=sc.nextInt();
			}
			Arrays.sort(shop);
			long sum=0;
			for(int i=0; i<order; i++) {
				int d=sc.nextInt();
				int place_exceed=lowerBound(shop,d);
				int place_fall=place_exceed-1;
				if(place_exceed==0) {
					place_fall=0;
				}
				sum+=Math.min(Math.abs(shop[place_exceed]-d), Math.abs(d-shop[place_fall]));
			}
			pl(sum);
		}
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	public static final int lowerBound(final int[] arr, final int value) {
		int low = 0;
		int high = arr.length;
		int mid;
		while (low < high) {
			mid = (high+low)/2;
			if (arr[mid] < value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if(low<arr.length) {
			return low;
		}
		else {
			return -1;
		}
	}
}
