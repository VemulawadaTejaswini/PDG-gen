import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static class SegTree{
		int size;
		int[] index;
		int[] data;
		
		public SegTree(int n){
			int n_ = 1;
			while(n_ < n){
				n_ *= 2; 
			}
			
			this.size = n_;
			
			
			index = new int[this.size * 2 - 1];
			for(int i = 0; i < index.length; i++){
				index[i] = Math.max(0, i - this.size + 1);
			}
			
			data = new int[this.size * 2 - 1];
			for(int i = 0; i < data.length; i++){
				data[i] = 0;
			}
		}
		
		public void comp(int t, int k1, int k2){
			data[t] = Math.max(data[k1], data[k2]);
			if(data[k1] >= data[k2]){
				index[t] = index[k1];
			}else if(data[k1] < data[k2]){
				index[t] = index[k2];
			}
		}
		
		public void update(int x, int a_diff){
			final int t = x + size - 1;
			
			//System.out.println(data.length + " " + x + " " + t);
			data[t] += a_diff;
			
			int k = t;
			while(k != 0){
				k = (k - 1) / 2;
				comp(k, k*2 + 1, k*2 + 2);
			}
		}
		
		public int get_top_index(){
			return index[0];
		}
		
		public int get_top_data(){
			return data[0];
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int R = sc.nextInt();
		final int L = sc.nextInt();
		
		SegTree seg = new SegTree(N);
		SegTree time = new SegTree(N);
		
		int prev_time = 0;
		for(int i = 0; i < R; i++){
			final int d = sc.nextInt() - 1;
			final int t = sc.nextInt();
			final int x = sc.nextInt();
			
			time.update(seg.get_top_index(), t - prev_time);
			prev_time = t;
			//System.out.println((time.get_top_index() + 1) + " " + time.get_top_data());
			
			seg.update(d, x);
			//System.out.println((seg.get_top_index() + 1) + " " + seg.get_top_data());
		}
		
		time.update(seg.get_top_index(), L - prev_time);
		
		System.out.println(time.get_top_index() + 1);
	}

}