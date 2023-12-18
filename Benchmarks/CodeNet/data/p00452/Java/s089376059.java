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
			int target=sc.nextInt();
			int point=sc.nextInt();
			if(target*point==0) {
				System.exit(0);
			}
			int[] score=new int[target*(target+3)/2+1];
			score[0]=0;
			for(int i=0; i<target; i++) {
				score[i+1]=sc.nextInt();
			}
			int counter=target+1;
			for(int i=1; i<=target; i++) {
				for(int j=1; j<=target; j++) {
					if(i<=j) {
						score[counter]=score[i]+score[j];
						counter++;
					}
				}
			}
			Arrays.sort(score);
			int max=0;
			for(int i=0; i<=target*(target+3)/2; i++) {
				int tmp=lowerBound(score,point-score[i]);
				if(point-score[i]>=0) {
					if(tmp==-1) {
						max=Math.max(max, score[i]+score[target*(target+3)/2]);
					}
					else if(score[i]+score[tmp]==point){
						max=Math.max(max, score[i]+score[tmp]);
					}
					else if(tmp>0 && score[i]+score[tmp]>point) {
						max=Math.max(max, score[i]+score[tmp-1]);
					}
					else if(tmp==0) {
						max=Math.max(max, score[i]);
					}
				}
				else {
					//
				}
			}
			pl(max);
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
